package com.nowcoder.community.service;


import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")   多例用的少
public class AlphaServices {


    @Autowired
    private AlphaDao alphaDao;

    public AlphaServices(){
        System.out.println("实例化AlphaServices");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaServices");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁AlphaServices");
    }

    public  String find(){
        return alphaDao.select();
    }
}
