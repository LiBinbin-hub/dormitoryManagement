package com.itheima.dao;

import com.itheima.po.Visitor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 访客
 */
public interface VisitorDao {
    /**
     * 进行分页查询
     */

    //获取总条数
    Integer totalCount(@Param("v_name") String v_name,
                              @Param("v_phone")Integer v_phone);
    //获取用户列表
    List<Visitor> getVisitorList(@Param("v_name") String v_name,
                                        @Param("v_phone")Integer v_phone,
                                        @Param("currentPage")Integer currentPage,
                                        @Param("pageSize")Integer pageSize);

    Integer addVisitor(Visitor visitor);   //添加学生信息
    List<Visitor> getAll();

    /**
     * 删除访客信息
     * @param visitorId
     * @return
     */
    int delVisitor(Integer visitorId);

    /**
     * 更新访客信息
     * @param visitor
     * @return
     */
    int updateVisitor(Visitor visitor);

    Visitor findVisitorById(Integer v_id);
}
