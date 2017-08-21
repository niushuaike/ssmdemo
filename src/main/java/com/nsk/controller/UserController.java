package com.nsk.controller;

import com.nsk.entity.User;
import com.nsk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oliver on 2017/8/21.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String getUser(Model model){
        User userById = userService.getUserById(1);
        model.addAttribute("user",userById);
        return "user";
    }


}
