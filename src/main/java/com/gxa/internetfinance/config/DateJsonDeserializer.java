package com.gxa.internetfinance.config;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author Administrator
 */
@Component
public class DateJsonDeserializer extends JsonDeserializer<Date> {

    @SneakyThrows
    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, com.fasterxml.jackson.core.JsonProcessingException {
        if (ObjectUtils.isEmpty(jsonParser)) {
            return null;
        }
        else {
            //2021-06-23T16:00:00.000Z
            String text = jsonParser.getText();
            int length = text.length();
            String s="yyyy-MM-dd HH:mm:ss";
//            if(text.compareTo("yyyy-MM-dd HH:mm:ss")!=0){
            if(text.length()!=s.length()){
                ZonedDateTime parse = ZonedDateTime.parse(text);
                LocalDateTime localDateTime = parse.toLocalDateTime();
                return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
            }
            else {
//                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                Date parse = dateFormat.parse(text);
                return null;
            }

        }
    }
}
