package com.myweb.service;

import com.myweb.entity.Userinfo;

public interface Userinfoservice {
    //用户登录
    String userLogin(Userinfo userinfo);

    String userLogin();
}
