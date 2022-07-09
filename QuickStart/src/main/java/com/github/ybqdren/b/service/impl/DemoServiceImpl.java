package com.github.ybqdren.b.service.impl;

import com.github.ybqdren.b.dao.DemoDao;
import com.github.ybqdren.b.factory.BeanFacotry;
import com.github.ybqdren.b.service.DemoService;

import java.util.List;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class DemoServiceImpl implements DemoService {
    DemoDao demoDao = BeanFacotry.getDemoDao();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
