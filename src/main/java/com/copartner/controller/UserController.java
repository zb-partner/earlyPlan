package com.copartner.controller;

import com.copartner.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/user")
    public String selectAll() {
        System.err.println(iUserService.selectAll());
        return "/pages/index.jsp";
    }
}
