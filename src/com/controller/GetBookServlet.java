package com.controller;

import com.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("getBookServlet")
public class GetBookServlet {
    @Autowired
    private BookService bookService;
    public List<String> doGet(){
        return bookService.findBookName2List();
    }

    public void doPost(){

    }
}
