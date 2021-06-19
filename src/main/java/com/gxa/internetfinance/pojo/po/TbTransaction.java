package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.io.Serializable;

/**
 * 交易表(TbTransaction)实体类
 *
 * @author makejava
 * @since 2021-06-07 16:54:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbTransaction{
    private static final long serialVersionUID = -51628886536406785L;
    /**
     * 交易id
     */
    private Integer tbTransactionId;
    /**
     * 交易流水号
     */
    private String tbTransactionSerialNumber;
    /**
     * 交易类型，1充值，2提现
     */
    private Integer tbTransactionType;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbTransactionCreateTime;
    /**
     * 交易完成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbTransactionPublishTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Timestamp tbTransactionUpdateTime;
    /**
     * 是否删除，0未删除，1已删除，默认未删除
     */
    private Integer tbTransactionIsDeleted;
    /**
     * 交易是否成功，0失败，1成功，2处理中，默认处理中
     */
    private Integer tbTransactionIsSuccess=2;




}
