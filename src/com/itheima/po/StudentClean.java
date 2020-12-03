package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @program: dormitorySystem
 * @description: 学生卫生
 * @author: Joyrocky
 * @create: 2019-04-25 12:12
 **/
@Data
public class StudentClean {
    private Integer g_id;
    private Integer s_studentid;
    private String s_name;
    private Integer s_grade;
    private Integer s_classid;
    private Integer s_dormitoryid;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_time;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_time;
}

