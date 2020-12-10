package com.itheima.dao;

import com.itheima.po.Electric;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ElectricDao {

    /**
     *添加水费缴纳记录
     */
    Integer addElectric(Electric electric);

    /**
     * 进行分页查询
     */
    //获取总条数
    Integer totalCount(@Param("e_dormitoryid") String e_dormitoryid,
                       @Param("e_dormbuilding") String e_dormbuilding,
                       @Param("e_time") String e_time);
    //获取用户列表
    List<Electric> getElectricList(@Param("e_dormitoryid") String e_dormitoryid,
                             @Param("e_dormbuilding") String e_dormbuilding,
                             @Param("e_time") String w_time,
                             @Param("currentPage") Integer currentPage,
                             @Param("pageSize") Integer pageSize);

    /**
     * 删除缴费记录
     * @param id
     * @return
     */
    Integer delElectric(Integer id);

    /**
     * 根据ID查找水费缴费记录
     * @param w_id
     * @return
     */
    Electric findElectricById(Integer w_id);

    /**
     * 梗系水费记录
     * @param electric
     * @return
     */
    Integer updateElectric(Electric electric);
}
