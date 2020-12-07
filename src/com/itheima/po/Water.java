package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Water {

    private Integer w_id;
    private String w_time;
    private String w_dormitoryid;
    private String w_money;
    private String w_dormbuilding;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date w_createtime;
}
