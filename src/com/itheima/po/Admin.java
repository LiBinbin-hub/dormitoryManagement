package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Admin {
    private  Integer a_id;
    private  String  a_username;

    @JsonIgnore
    private  String  a_password;

    private  String  a_name;
    private  Long a_phone;

    @JsonIgnore
    private  Integer a_power;

    private  String  a_describe;

}
