package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Electric {

    private Integer e_id;
    private String e_time;
    private String e_dormitoryid;
    private String e_money;
    private String e_dormbuilding;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date e_createtime;
}
