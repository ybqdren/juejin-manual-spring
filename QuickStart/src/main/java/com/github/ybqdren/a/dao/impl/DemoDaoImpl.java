package com.github.ybqdren.a.dao.impl;

import com.github.ybqdren.a.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class DemoDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        // todo 访问数据库
        return Arrays.asList("aaa","bbb","ccc");
    }
}
