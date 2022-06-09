package com.tuzhi.service.bookread;

import com.tuzhi.pojo.BookRead;
import com.tuzhi.pojo.vo.BookReadVo;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2022-06-09 15:31
 **/

public interface BookReadService {
    // 添加图书借阅
    int addBookRead(BookRead bookRead);

    // 修改图书借阅
    int updateBookRead(BookRead bookRead);

    //删除图书借阅
    int deleteBookRead(Integer id);

    //查询所有图书借阅
    List<BookReadVo> selectBookRead();
}
