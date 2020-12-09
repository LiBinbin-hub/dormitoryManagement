package com.itheima.service.impl;

import com.itheima.dao.WaterDao;
import com.itheima.po.Water;
import com.itheima.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("waterService")
@Transactional
public class WaterServiceImpl implements WaterService {

    @Autowired
    private WaterDao waterDao;

    @Override
    public int addWater(Water water) {
        return waterDao.addWater(water);
    }
}
