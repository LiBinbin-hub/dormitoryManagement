package com.itheima.controller;

import com.itheima.po.Electric;
import com.itheima.po.PageInfo;
import com.itheima.po.Water;
import com.itheima.service.ElectricService;
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
public class ElectricController {

    @Autowired
    private ElectricService electricService;

    /**
     * 添加水费信息
     */
    @RequestMapping(value = "/addElectric" ,method = RequestMethod.POST)
    @ResponseBody
    public String addElectric(@RequestBody Electric electric) {

        System.out.println("electric: " + electric);
        int e = electricService.addElectric(electric);
        return "electric_list";
    }

    /**
     * 分页查询
     * pageIndex 当前页码
     * pageSize  显示条数
     */
    @RequestMapping(value = "/getElectricList")
    public String getElectricList(String e_dormitoryid, String e_dormbuilding , String e_time, Integer pageIndex,
                              Integer pageSize, Model model) {

        PageInfo<Electric> pi = electricService.findPageInfo(e_dormitoryid, e_dormbuilding, e_time,
                pageIndex,pageSize);
        model.addAttribute("pi",pi);
        model.addAttribute("v_name","*****");
        return "electric_list";
    }

    /**
     * 删除水费缴纳记录
     */

    @RequestMapping(value = "/delElectric" ,method = RequestMethod.GET)
    @ResponseBody
    public String delElectric(Integer e_id) {
        System.out.println("ElectricId" + e_id);
        Integer w = electricService.delElectric(e_id);
        return "electric_list";
    }


    @RequestMapping( "/findElectricById")
    public String findElectricById(Integer e_id, HttpSession session) {

        Electric e = electricService.findElectricById(e_id);
        session.setAttribute("e",e);
        return "electric_edit";
    }

    /**
     * 修改水费记录
     */
    @RequestMapping( value = "/updateElectric", method = RequestMethod.POST)
    public String updateElectric( Electric electric) {
        int w = electricService.updateElectric(electric);
        return "redirect:/getElectricList";
    }
}
