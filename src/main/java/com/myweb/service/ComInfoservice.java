package com.myweb.service;

import com.myweb.entity.ComInfo;

import java.util.List;

public interface ComInfoservice {

    List<ComInfo> selectall();

    int insertall(ComInfo comInfo);

    int updateall(ComInfo comInfo);

    int deleteall(ComInfo comInfo);

    int addfavourable(int id);
}
