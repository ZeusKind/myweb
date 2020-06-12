package com.myweb.Dao;

import com.myweb.entity.ComInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ComInfoMapper {

    List<ComInfo> selectall();
    int insertall(ComInfo comInfo);
    int updateall(ComInfo comInfo);
    int deleteall(ComInfo comInfo);
}
