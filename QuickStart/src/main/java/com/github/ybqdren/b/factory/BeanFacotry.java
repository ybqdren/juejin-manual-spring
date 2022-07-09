package com.github.ybqdren.b.factory;

import com.github.ybqdren.b.dao.DemoDao;
import com.github.ybqdren.b.dao.impl.DemoOracleDaoImpl;

/**
 * BeanFactory 强依赖于 DemoDaoImpl：紧耦合
 *
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class BeanFacotry {
    public static DemoDao getDemoDao() {
        return new DemoOracleDaoImpl();
    }
}
