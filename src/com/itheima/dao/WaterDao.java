package com.itheima.dao;

import com.itheima.po.Visitor;
import com.itheima.po.Water;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WaterDao {

    /**
     *添加水费缴纳记录
     */
    Integer addWater(Water water);

    /**
     * 进行分页查询
     */
    //获取总条数
    Integer totalCount(@Param("w_dormitoryid") String w_dormitoryid,
                              @Param("w_dormbuilding") String w_dormbuilding,
                              @Param("w_time") String w_time);
    //获取用户列表
    List<Water> getWaterList(@Param("w_dormitoryid") String w_dormitoryid,
                                      @Param("w_dormbuilding") String w_dormbuilding,
                                      @Param("w_time") String w_time,
                                      @Param("currentPage")Integer currentPage,
                                      @Param("pageSize")Integer pageSize);

    /**
     * 删除缴费记录
     * @param id
     * @return
     */
    Integer delWater(Integer id);

    /**
     * 根据ID查找水费缴费记录
     * @param w_id
     * @return
     */
    Water findWaterById(Integer w_id);

    /**
     * 梗系水费记录
     * @param water
     * @return
     */
    Integer updateWater(Water water);
}
