package com.mrz.test;

import com.mrz.pojo.UserInfo;
import com.mrz.service.UserInfoService;
import com.mrz.vo.UserInfoVo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml", "spring-entity.xml");
        UserInfoService bean = context.getBean(UserInfoService.class);


    }
}
