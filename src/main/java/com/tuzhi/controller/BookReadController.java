package com.tuzhi.controller;

import com.tuzhi.pojo.vo.BookReadVo;
import com.tuzhi.service.bookread.BookReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: ssmbuild
 * @description: 读书借阅业务
 * @author: 兔子
 * @create: 2022-06-09 15:36
 **/

@Controller
@RequestMapping("/bookread")
public class BookReadController {
    @Autowired
    BookReadService bookReadService;

    @RequestMapping("/allBookRead")
    public String list(Model model) {
        List<BookReadVo> bookReadVos = bookReadService.selectBookRead();
        model.addAttribute("list", bookReadVos);
        return "bookread/allBookRead";
    }
}
