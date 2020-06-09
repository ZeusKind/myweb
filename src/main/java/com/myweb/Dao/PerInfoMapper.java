package com.myweb.Dao;

import com.myweb.entity.PerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository

public interface PerInfoMapper {

    List<PerInfo> selectName();
    int insertAll(PerInfo perInfo);

}

