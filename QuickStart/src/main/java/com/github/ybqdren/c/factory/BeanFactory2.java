package com.github.ybqdren.c.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class BeanFactory2 {

    private static Properties properties;

    // 缓存区，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();


    static {
        properties = new Properties();

        try {
            properties.load(
                    BeanFactory2.class
                            .getClassLoader()
                            .getResourceAsStream("factory-c.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error,cause: " + e.getMessage());
        }
    }


    public static Object getBean(String beanName) {

        // Double Check 单例
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory2.class) {
                if (!beanMap.containsKey(beanName)) {

                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object bean = beanClazz.newInstance();
                        beanMap.put(beanName, bean);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }

                }
            }
        }

        return beanMap.get(beanName);
    }
}
