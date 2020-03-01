package com.shuaige.dao;

import com.shuaige.model.Accounts;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountsDao {
    @Select("select * from accounts")
    List<Accounts> findAll();

    @Insert("insert into accounts (name, money) values (#{name}, ${money})")
    int insertOne(Accounts accounts);
}
