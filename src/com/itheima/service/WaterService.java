package com.itheima.service;


import com.itheima.po.PageInfo;
import com.itheima.po.Visitor;
import com.itheima.po.Water;

public interface WaterService {

    /**
     * 添加水费缴费记录
     * @param water
     * @return
     */
    int addWater(Water water);

    /**
     * 分页查询
     * @param w_time
     * @param w_dormitoryid
     * @param w_dormbuilding
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageInfo<Water> findPageInfo(String w_dormitoryid, String w_dormbuilding, String w_time,
                                 Integer pageIndex, Integer pageSize);

    /**
     * 删除水费缴纳记录
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
     *更新水费记录
     * @param water
     * @return
     */
    Integer updateWater(Water water);
}
