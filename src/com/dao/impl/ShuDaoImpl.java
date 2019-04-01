package com.dao.impl;

import com.dao.BookDao;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ShuDaoImpl implements BookDao {

    @Override
    public List<String> getBookName2List() {
        List<String> bookNameList = Arrays.asList("Mybatis从入门到放弃", "Spring从删库到跑路");
        return bookNameList;
    }
}
