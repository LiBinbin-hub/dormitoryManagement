package com.itheima.service.impl;

import com.itheima.po.Water;
import com.itheima.service.WaterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("waterService")
@Transactional
public class WaterServiceImpl implements WaterService {

    @Override
    public int addWater(Water water) {
        return 0;
    }
}
