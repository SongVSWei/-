package com.gxa.internetfinance.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/7 14:34
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parameter {

    private Integer id;
    private String type;
    private String name;
    private Double value;
    private String desc;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
}
