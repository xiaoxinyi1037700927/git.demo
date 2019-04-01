package cn.dao;

import org.springframework.beans.factory.annotation.Autowired;

public interface BookDao {
    @Autowired
    int[] selct();
}
