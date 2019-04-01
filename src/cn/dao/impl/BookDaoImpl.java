package cn.dao.impl;

import cn.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public int[] selct(){
        int[] a =new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=i;
        }
        return a;
    }
}
