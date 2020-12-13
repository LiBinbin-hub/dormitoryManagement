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

import javax.servlet.http.HttpSession;

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
        return "water_list";
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
                pageIndex, pageSize);
        model.addAttribute("pi",pi);
        model.addAttribute("v_name","*****");
        return "water_list";
    }

    /**
     * 删除水费缴纳记录
     */

    @RequestMapping(value = "/delWater" ,method = RequestMethod.GET)
    @ResponseBody
    public String delVisitor(Integer w_id) {
        System.out.println("visitorId" + w_id);
        Integer w = waterService.delWater(w_id);
        return "water_list";
    }


    @RequestMapping( "/findWaterById")
    public String findWaterById(Integer w_id, HttpSession session) {

        Water w= waterService.findWaterById(w_id);
        session.setAttribute("w",w);
        return "water_edit";
    }

    /**
     * 修改水费记录
     */
    @RequestMapping( value = "/updateWater", method = RequestMethod.POST)
    public String updateWater( Water water) {
        int w = waterService.updateWater(water);
        return "redirect:/getWaterList";
    }
}
