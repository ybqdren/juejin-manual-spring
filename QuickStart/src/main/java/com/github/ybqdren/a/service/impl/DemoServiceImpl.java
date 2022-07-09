package com.github.ybqdren.a.service.impl;

import com.github.ybqdren.a.dao.DemoDao;
import com.github.ybqdren.a.dao.impl.DemoDaoImpl;
import com.github.ybqdren.a.service.DemoService;

import java.util.List;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class DemoServiceImpl implements DemoService {
    private DemoDao demoDao = new DemoDaoImpl();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
