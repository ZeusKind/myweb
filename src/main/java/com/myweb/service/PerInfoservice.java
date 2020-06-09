package com.myweb.service;

import com.myweb.entity.PerInfo;

import java.util.List;

public interface PerInfoservice {

    List<PerInfo> selectName();

    int insertAll(PerInfo perInfo);

}
