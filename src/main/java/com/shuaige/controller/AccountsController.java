package com.shuaige.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountsController {
    @RequestMapping("/accounts")
    public String accounts(){
        return "accounts";
    }
}
