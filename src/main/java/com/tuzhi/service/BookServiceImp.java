package com.tuzhi.service;

import com.tuzhi.dao.BookMapper;
import com.tuzhi.pojo.Book;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 18:19
 **/

public class BookServiceImp implements BookService{
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public List<Book> selectBook() {
        return bookMapper.selectBook();
    }
}
