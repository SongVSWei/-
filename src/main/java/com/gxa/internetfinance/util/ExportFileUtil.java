package com.gxa.internetfinance.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.hssf.usermodel.*;

import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/10 9:32
 * @Description: 导出表格工具类
 */
public class ExportFileUtil {
    /**
     * 方法描述：导出功能
     * 注意：泛型T类字段名和containBean集合里字段名字的一致性
     *
     * @param title       表名
     * @param headers     表头
     * @param list        数据集
     * @param containBean 数据集类型字段
     **/
    public static <T> void exportExcel(HttpServletResponse response, String title, String[] headers, List<T> list, List<String> containBean) throws Exception {
        try (HSSFWorkbook workbook = new HSSFWorkbook()) {
            HSSFSheet sheet = workbook.createSheet();
            HSSFRow row = sheet.createRow(0);
            //创建第一行表头
            for (short i = 0; i < headers.length; i++) {
                HSSFCell cell = row.createCell(i);
                HSSFRichTextString textString = new HSSFRichTextString(headers[i]);
                cell.setCellValue(textString);
            }
            Iterator<T> it = list.iterator();
            int index = 0;
            while (it.hasNext()) {
                index++;
                row = sheet.createRow(index);
                T t = it.next();
                //通过反射得到字段
                Field[] fields = t.getClass().getDeclaredFields();
                //如果需要匹配
                if (!CollectionUtils.isEmpty(containBean)) {
                    for (Field field : fields) {
                        for (int j = 0; j < containBean.size(); j++) {
                            if (field.getName().equals(containBean.get(j))) {
                                setCellValue(t, field, row, j);
                                break;
                            } else if (containBean.get(j).startsWith(field.getName())) {
//                                判断是否是对象字段
                                Field[] subFields = field.getType().getDeclaredFields();
                                for (Field subField : subFields) {
                                    if ((field.getName() + "." + subField.getName()).equals(containBean.get(j))) {
                                        setCellValue(invoke(t, field), subField, row, j);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
//                else {
//                    for (int i = 0; i < fields.length; i++) {
//                        Field field = fields[i];
//                        setCellValue(t, field, row, i);
//                    }
//                }
            }
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.addHeader("Content-Disposition", "attachment;filename=" + new String((title).getBytes() + ".xls"));
//            response.addHeader("Content-Disposition", "attachment;filename=" + toUtf8String((title)+ ".xls"));
            workbook.write(response.getOutputStream());
        }
    }

    /**
     * 方法描述：设置每一行中的列
     **/
    private static <T> void setCellValue(T t, Field field, HSSFRow row, int index) {
        HSSFCell cell = row.createCell(index);
        Object value = invoke(t, field);
        String textValue = null;
        if (value != null) {
            if (value instanceof Date) {
                Date date = (Date) value;
                textValue = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
            } else {
                textValue = value.toString();
            }
        }
        if (textValue != null) {
            cell.setCellValue(textValue);
        }
    }

    /**
     * 方法描述：通过反射获取数据集字段
     *
     * @param t 泛型
     * @return T
     **/
    private static <T> Object invoke(T t, Field field) {
        try {
            String fieldName = field.getName();
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor(fieldName, t.getClass());
            Method readMethod = propertyDescriptor.getReadMethod();
            return readMethod.invoke(t);
        } catch (Exception e) {
            return null;
        }
    }
    public static String toUtf8String(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0 && c <= 255) {
                sb.append(c);
            } else {
                byte[] b;
                try {
                    b = Character.toString(c).getBytes("utf-8");
                } catch (Exception ex) {
                    System.out.println(ex);
                    b = new byte[0];
                }
                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0) k += 256;
                    sb.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return sb.toString();
    }
}
