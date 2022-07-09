package com.github.ybqdren.c.service.impl;

import com.github.ybqdren.c.dao.DemoDao;
import com.github.ybqdren.c.factory.BeanFactory2;
import com.github.ybqdren.c.service.DemoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class DemoServiceImpl implements DemoService {
    DemoDao demoDao = (DemoDao) BeanFactory2.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
