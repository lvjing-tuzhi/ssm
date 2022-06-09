package com.tuzhi.service.bookread;

import com.tuzhi.dao.bookread.BookReadMapper;
import com.tuzhi.dao.user.UserMapper;
import com.tuzhi.pojo.BookRead;
import com.tuzhi.pojo.vo.BookReadVo;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2022-06-09 15:31
 **/

public class BookReadServiceImpl implements BookReadService{
    private BookReadMapper bookReadMapper;

    public void setBookReadMapper(BookReadMapper bookReadMapper) {
        this.bookReadMapper = bookReadMapper;
    }

    @Override
    public int addBookRead(BookRead bookRead) {
        return bookReadMapper.addBookRead(bookRead);
    }

    @Override
    public int updateBookRead(BookRead bookRead) {
        return bookReadMapper.updateBookRead(bookRead);
    }

    @Override
    public int deleteBookRead(Integer id) {
        return bookReadMapper.deleteBookRead(id);
    }

    @Override
    public List<BookReadVo> selectBookRead() {
        return bookReadMapper.selectBookRead();
    }
}
