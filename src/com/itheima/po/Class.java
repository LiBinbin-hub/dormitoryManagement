package com.itheima.po;

import lombok.Data;
import java.util.List;

@Data
public class Class {
    private  Integer c_id;
    private  Integer c_classid;
    private  String  c_classname;
    private  String  c_counsellor;
    //班级与学生为一对多关系，使用链表
    private List<Student>  students;
}
