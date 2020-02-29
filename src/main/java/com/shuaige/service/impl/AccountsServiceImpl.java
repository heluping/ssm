package com.shuaige.service.impl;

import com.shuaige.model.Accounts;
import com.shuaige.service.inter.AccountsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "accountsServiceImpl")
public class AccountsServiceImpl implements AccountsService {
    @Override
    public List<Accounts> findAll() {
        System.out.println("hello world");
        return null;
    }
}
