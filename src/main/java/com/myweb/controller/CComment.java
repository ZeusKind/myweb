package com.myweb.controller;

import com.myweb.entity.ComInfo;
import com.myweb.service.ComInfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
* 留言栏页面的控制类
*
* wuzuowei
* 20200610
* */
@RestController
public class CComment {

    @Autowired
    ComInfoservice comInfoservice;

    @RequestMapping(value = "/selectallcomment")
    public List<ComInfo> selectall(){
        List<ComInfo> list  = comInfoservice.selectall();
        return list;
    }

    @RequestMapping("/insertallcomment")
    public ModelAndView insertall(@ModelAttribute ComInfo comInfo) {
        comInfoservice.insertall(comInfo);
        return new ModelAndView("test");
    }

    @RequestMapping("/showTest")
    public ModelAndView showTest() {
        return new ModelAndView("test");
    }

    @RequestMapping("/updateallcomment")
    public ModelAndView updateall(@ModelAttribute ComInfo comInfo) {
        comInfoservice.updateall(comInfo);
        return new ModelAndView("test");
    }

    @RequestMapping("/deleteallcomment")
    public int deleteall(ComInfo comInfo) {
        return comInfoservice.deleteall(comInfo);
    }

    //添加一个赞
    @RequestMapping("/addfavourable")
    public int addfavourable(@RequestParam(value = "id")int id){
        System.out.println(id);
        return comInfoservice.addfavourable(id);
    }


}
