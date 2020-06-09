package com.myweb.controller;

import com.github.pagehelper.PageHelper;
import com.myweb.entity.PerInfo;
import com.myweb.service.PerInfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Control {

    @Autowired
    PerInfoservice perInfoservice;

    @RequestMapping("/hello")
    public List<PerInfo> Hello() {
        List<PerInfo> list = perInfoservice.selectName();
        System.out.println(list);
        return list;
    }

    @RequestMapping("/ll")
    public int ll(@RequestParam(value = "name" ,required = false) String name) {
        PerInfo perInfo = new PerInfo();
        perInfo.setName(name);
        return perInfoservice.insertAll(perInfo);
    }


}
