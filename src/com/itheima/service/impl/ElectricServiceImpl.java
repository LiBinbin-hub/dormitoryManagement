package com.itheima.service.impl;

import com.itheima.dao.ElectricDao;
import com.itheima.dao.WaterDao;
import com.itheima.po.Electric;
import com.itheima.po.PageInfo;
import com.itheima.po.Water;
import com.itheima.service.ElectricService;
import com.itheima.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("electricService")
@Transactional
public class ElectricServiceImpl implements ElectricService {

    @Autowired
    private ElectricDao electricDao;

    @Override
    public int addElectric(Electric electric) {
        return electricDao.addElectric(electric);
    }

    @Override
    public PageInfo<Electric> findPageInfo(String e_dormitoryid, String e_dormbuilding, String e_time,
                                        Integer pageIndex, Integer pageSize)
    {
        PageInfo<Electric> pi = new PageInfo<Electric>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = electricDao.totalCount(e_dormitoryid, e_dormbuilding, e_time);
        if (totalCount>0){
            pi.setTotalCount(totalCount);
            //每一页显示学生信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<Electric> electricList =	electricDao.getElectricList(e_dormitoryid, e_dormbuilding, e_time,
                    (pi.getPageIndex()-1)*pi.getPageSize(), pi.getPageSize());
            pi.setList(electricList);
        }
        return pi;
    }

    @Override
    public Integer delElectric(Integer id) {
        return electricDao.delElectric(id);
    }

    @Override
    public Electric findElectricById(Integer e_id) {
        return electricDao.findElectricById(e_id);
    }

    @Override
    public Integer updateElectric(Electric electric) {
        return electricDao.updateElectric(electric);
    }

}
