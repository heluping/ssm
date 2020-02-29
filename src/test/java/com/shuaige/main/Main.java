package com.shuaige.main;

import com.shuaige.service.impl.AccountsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-config.xml");
        AccountsServiceImpl accountsService = (AccountsServiceImpl) app.getBean("accountsServiceImpl");
        accountsService.findAll();
    }
}
