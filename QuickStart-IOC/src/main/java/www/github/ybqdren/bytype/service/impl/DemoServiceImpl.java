package www.github.ybqdren.bytype.service.impl;


import www.github.ybqdren.bytype.dao.DemoDao;
import www.github.ybqdren.bytype.factory.BeanFactory2;
import www.github.ybqdren.bytype.service.DemoService;

import java.util.List;

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
