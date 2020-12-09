package com.itheima.service;

import com.itheima.po.PageInfo;
import com.itheima.po.Visitor;
import org.springframework.ui.Model;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 访客
 * @author: Joyrocky
 * @create: 2019-05-14 12:39
 **/
public interface VisitorService {
    //分页查询
    PageInfo<Visitor> findPageInfo(String v_name, Integer v_phone , Integer pageIndex, Integer pageSize);
    int addVisitor(Visitor visitor);   //添加访客信息
    List<Visitor> getAll();

    /**
     * 删除访客信息
     * @param visitorId
     * @return
     */
    int delVisitor(Integer visitorId);

    /**
     * 修改访客信息
     * @param visitor
     * @return
     */
    int updateVisitor(Visitor visitor);

    /**
     * 根据ID查找访客
     * @param v_id
     * @return
     */
    Visitor findVisitorById(Integer v_id);
}
