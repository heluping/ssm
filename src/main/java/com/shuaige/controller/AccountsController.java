package com.shuaige.controller;


import com.shuaige.model.Accounts;
import com.shuaige.service.impl.AccountsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class AccountsController {
    @Autowired
    private AccountsServiceImpl accountsService;

    @RequestMapping("/accounts")
    public @ResponseBody HashMap<String, Object> accounts(){
        List<Accounts> accountsList = accountsService.findAll();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("code", 0);
        hashMap.put("list", accountsList);
        return hashMap;
    }
}
