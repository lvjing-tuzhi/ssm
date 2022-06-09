package com.tuzhi.dao.bookread;

import com.tuzhi.pojo.BookRead;
import com.tuzhi.pojo.vo.BookReadVo;

import java.util.List;

/**
 * @program: ssmbuild
 * @description: 图书借阅dao
 * @author: 兔子
 * @create: 2022-06-09 14:52
 **/

public interface BookReadMapper {
    // 添加图书借阅
    int addBookRead(BookRead bookRead);

    // 修改图书借阅
    int updateBookRead(BookRead bookRead);

    //删除图书借阅
    int deleteBookRead(Integer id);

    //查询所有图书借阅
    List<BookReadVo> selectBookRead();
}
