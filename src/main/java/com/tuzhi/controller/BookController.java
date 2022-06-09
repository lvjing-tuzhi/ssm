package com.tuzhi.controller;

import com.tuzhi.pojo.Book;
import com.tuzhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        return "allBook";
    }

//    跳转到添加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

//    添加书籍
    @RequestMapping("addBook")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

//    跳转到修改书籍
    @RequestMapping("toUpdateBook")
    public String toUpdateBook(Model model,int id) {
        Book book = bookService.selectBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }

//    修改书籍
    @RequestMapping("updateBook")
    public String updateBook(Book book) {
        int i = bookService.updateBook(book);
        if (i >= 1) System.out.println("添加成功");
        return "redirect:/book/allBook";
    }

//    删除书籍
    @RequestMapping("del/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        int i = bookService.deleteBook(id);
        if(i >= i) System.out.println("删除成功");
        return "redirect:/book/allBook";
    }
    @RequestMapping("queryBook")
    public String queryBook(String queryBookName,Model model) {
        Book book = bookService.selectBookByName(queryBookName);
        List<Book> books = new ArrayList<>();
        books.add(book);
        if (book == null) {
            model.addAttribute("error","未查询到");
        }else {
            model.addAttribute("list",books);
        }
        return "allBook";
    }

}
