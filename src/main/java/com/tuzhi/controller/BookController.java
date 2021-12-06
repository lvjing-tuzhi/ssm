package com.tuzhi.controller;

import com.tuzhi.pojo.Book;
import com.tuzhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 20:42
 **/

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;


    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Book> books = bookService.selectBook();
        model.addAttribute("list",books);
        for (Book book : books) {
            System.out.println(book);
        }
        return "allBook";
    }
}
