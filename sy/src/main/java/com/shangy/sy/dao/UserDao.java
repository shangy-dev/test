package com.shangy.sy.dao;

import com.shangy.sy.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {

    @Select("select * from test")
    List<Map> test();

    List<Map> test1();

    int insert(User user);
}
