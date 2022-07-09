package www.github.ybqdrem.bytype.service.impl;


import www.github.ybqdrem.bytype.dao.DemoDao;
import www.github.ybqdrem.bytype.factory.BeanFactory2;
import www.github.ybqdrem.bytype.service.DemoService;

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
