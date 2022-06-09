package com.tuzhi.controller;

import com.tuzhi.pojo.User;
import com.tuzhi.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 20:42
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService UserService;


    @RequestMapping("/allUser")
    public String list(Model model) {
        List<User> Users = UserService.selectUser();
        model.addAttribute("list",Users);
        return "user/allUser";
    }

//    跳转到添加书籍页面
    @RequestMapping("/toAddUser")
    public String toAddUser() {
        return "user/addUser";
    }

//    添加书籍
    @RequestMapping("addUser")
    public String addUser(User User) {
        UserService.addUser(User);
        return "redirect:/user/allUser";
    }

//    跳转到修改书籍
    @RequestMapping("toUpdateUser")
    public String toUpdateUser(Model model,int id) {
        User user = UserService.selectUserById(id);

        model.addAttribute("user",user);
        return "user/updateUser";
    }

//    修改书籍
    @RequestMapping("updateUser")
    public String updateUser(User User) {
        int i = UserService.updateUser(User);
        if (i >= 1) System.out.println("添加成功");
        return "redirect:/user/allUser";
    }

//    删除书籍
    @RequestMapping("del/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        int i = UserService.deleteUser(id);
        if(i >= i) System.out.println("删除成功");
        return "redirect:/user/allUser";
    }

}
