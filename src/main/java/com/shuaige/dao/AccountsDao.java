package com.shuaige.dao;

import com.shuaige.model.Accounts;

import java.util.List;

public interface AccountsDao {
    List<Accounts> findAll();
}
