package cn.service.impl;

import cn.dao.BookDao;
import cn.service.Services;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Services {
    @Autowired
    private BookDao bookDao;

    @Override
    public int[] select(){
        return bookDao.selct();
    }
}
