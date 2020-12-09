package com.itheima.service.impl;

import com.itheima.dao.WaterDao;
import com.itheima.po.PageInfo;
import com.itheima.po.Water;
import com.itheima.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("waterService")
@Transactional
public class WaterServiceImpl implements WaterService {

    @Autowired
    private WaterDao waterDao;

    @Override
    public int addWater(Water water) {
        return waterDao.addWater(water);
    }

    @Override
    public PageInfo<Water> findPageInfo(String w_dormitoryid, String w_dormbuilding, String w_time,
                                        Integer pageIndex, Integer pageSize)
    {
        PageInfo<Water> pi = new PageInfo<Water>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = waterDao.totalCount(w_dormitoryid, w_dormbuilding, w_time);
        if (totalCount>0){
            pi.setTotalCount(totalCount);
            //每一页显示学生信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<Water> waterList =	waterDao.getWaterList(w_dormitoryid, w_dormbuilding, w_time,
                    (pi.getPageIndex()-1)*pi.getPageSize(), pi.getPageSize());
            pi.setList(waterList);
        }
        return pi;
    }


}
