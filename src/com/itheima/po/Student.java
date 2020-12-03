package com.itheima.po;

import lombok.Data;

@Data
public class Student {
    private static final long serialVersionUID = 1L;
    private  Integer s_id;
    private  Integer s_studentid;
    private  String  s_name;
    private  String  s_sex;
    private  Integer  s_age;
    private  Long  s_phone;
    private  Integer  s_classid;
    private  String s_classname;
    private  Integer  s_dormitoryid;
}
