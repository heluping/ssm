package com.shuaige.service.impl;

import com.shuaige.dao.AccountsDao;
import com.shuaige.model.Accounts;
import com.shuaige.service.inter.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "accountsServiceImpl")
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    private AccountsDao accountsDao;

    @Override
    public List<Accounts> findAll() {
        List<Accounts> list = accountsDao.findAll();
        return list;
    }

    @Override
    public int insertOne(Accounts accounts) {
        int num = accountsDao.insertOne(accounts);
        System.out.println(num);
        return 0;
    }
}
