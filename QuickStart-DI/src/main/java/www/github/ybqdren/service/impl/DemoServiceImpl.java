package www.github.ybqdren.service.impl;


import www.github.ybqdren.dao.DemoDao;
import www.github.ybqdren.factory.BeanFactory2;
import www.github.ybqdren.service.DemoService;

import java.util.List;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class DemoServiceImpl implements DemoService {
    DemoDao demoDao = (DemoDao) BeanFactory2.getBean("demoDao");

//    DemoDao demoDao = (DemoDao) new ClassPathXmlApplicationContext("inject-set3.xml").getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
