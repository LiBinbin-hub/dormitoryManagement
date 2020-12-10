package com.itheima.service;

import com.itheima.po.Electric;
import com.itheima.po.PageInfo;
import com.itheima.po.Water;

public interface ElectricService {

    /**
     * 添加电费缴费记录
     * @param electric
     * @return
     */
    int addElectric(Electric electric);

    /**
     * 分页查询
     * @param e_time
     * @param e_dormitoryid
     * @param e_dormbuilding
     * @param pageIndex
     * @param pageSize
     * @return
     */
    PageInfo<Electric> findPageInfo(String e_dormitoryid, String e_dormbuilding, String e_time,
                                 Integer pageIndex, Integer pageSize);

    /**
     * 删除水费缴纳记录
     * @param id
     * @return
     */
    Integer delElectric(Integer id);

    /**
     * 根据ID查找水费缴费记录
     * @param e_id
     * @return
     */
    Electric findElectricById(Integer e_id);

    /**
     *更新水费记录
     * @param electric
     * @return
     */
    Integer updateElectric(Electric electric);
}
