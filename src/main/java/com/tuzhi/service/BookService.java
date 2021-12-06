package com.tuzhi.service;

import com.tuzhi.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 18:19
 **/

public interface BookService {
    //    添加一本书
    int addBook(Book book);
    //    删除一本书
    int deleteBook(int id);
    //    修改一本书
    int updateBook(Book book);
    //    查找书根据ID
    Book selectBookById(int id);
    //    查找所有的书
    List<Book> selectBook();
}
