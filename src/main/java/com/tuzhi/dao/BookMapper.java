package com.tuzhi.dao;

import com.tuzhi.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 18:06
 **/

public interface BookMapper {
//    添加一本书
    int addBook(Book book);
//    删除一本书
    int deleteBook(@Param("id") int id);
//    修改一本书
    int updateBook(Book book);
//    查找书根据ID
    Book selectBookById(@Param("id") int id);
//    查找所有的书
    List<Book> selectBook();
}
