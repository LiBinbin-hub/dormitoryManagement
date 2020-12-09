package com.itheima.controller;

import com.itheima.po.PageInfo;
import com.itheima.po.Student;
import com.itheima.po.Water;
import com.itheima.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 水费管理
 */
@Controller
public class WaterController {

    @Autowired
    private WaterService waterService;

    /**
     * 添加水费信息
     */
    @RequestMapping(value = "/addWater" ,method = RequestMethod.POST)
    @ResponseBody
    public String addWater(@RequestBody Water water) {

        System.out.println("water: " + water);
        int s = waterService.addWater(water);
        return "student_list";
    }

    /**
     * 分页查询
     * pageIndex 当前页码
     * pageSize  显示条数
     */
    @RequestMapping(value = "/getWaterList")
    public String getWaterList(String w_dormitoryid, String w_dormbuilding , String w_time, Integer pageIndex,
                              Integer pageSize, Model model) {

        PageInfo<Water> pi = waterService.findPageInfo(w_dormitoryid, w_dormbuilding, w_time,
                pageIndex,pageSize);
        model.addAttribute("pi",pi);
        model.addAttribute("v_name","*****");
        return "water_list";
    }
}
