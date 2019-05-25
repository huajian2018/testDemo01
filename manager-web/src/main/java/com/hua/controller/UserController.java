package com.hua.controller;

import com.hua.entity.User;
import com.hua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author 周华山
 * @Date 2019/5/25 13:53
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = {"/user",""})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String goAddUser(@PathVariable("page") String page){
        return page;
    }
    @RequestMapping("/listUser")
    public String listUser(Map map){
        List<User> userList=userService.getAll();
        map.put("users",userList);
        return "listUser";
    }

    @RequestMapping("/insertUser")
    public String insertUser(User user){
        this.userService.addUser(user);
        return "redirect:/listUser";
    }
    /*@RequestMapping(value = {"/addUser"})
    public String addUser(User user){
        return "success";
    }*/

}
