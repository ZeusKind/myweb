package com.myweb.controller;

import com.myweb.entity.ComInfo;
import com.myweb.service.ComInfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* 留言栏页面的控制类
*
* wuzuowei
* 20200610
* */
@RestController
public class commentController {

    @Autowired
    ComInfoservice comInfoservice;

    @PostMapping("/selectallcomment")
    public List<ComInfo> selectall(){
        List<ComInfo> list  = comInfoservice.selectall();
        System.out.println(list);
        return list;
    }




}
