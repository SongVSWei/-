package com.gxa.internetfinance.pojo.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Userdetail {

    private Integer id;
    private String phone;
    private String bankCard;
    private String name;
    private String branchName;

}
