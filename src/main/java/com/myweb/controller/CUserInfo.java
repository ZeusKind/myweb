package com.myweb.controller;

import com.myweb.common.RequestData;
import com.myweb.common.ResponseData;
import com.myweb.common.utils.WebBeanCreator;
import com.myweb.entity.Userinfo;
import com.myweb.service.Userinfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CUserInfo {

    @Autowired
    Userinfoservice userinfoservice;

    @RequestMapping("/login")
    public ResponseData userLogin(@RequestBody RequestData param){
        Userinfo userinfo = (Userinfo) WebBeanCreator.create(Userinfo.class, param.getData());
        return ResponseData.ok(userinfoservice.userLogin(userinfo));
    }

    @RequestMapping("/login2")
    public ResponseData userLogin(@RequestParam(value = "userName")String userName, @RequestParam(value = "password")String password){
        Userinfo userinfo = new Userinfo();
        userinfo.setUserName(userName);
        userinfo.setPassword(password);
        return ResponseData.ok(userinfoservice.userLogin(userinfo));
    }
}
