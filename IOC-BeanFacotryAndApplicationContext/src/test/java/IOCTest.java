import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import www.github.ybqdren.annotation.Color;
import www.github.ybqdren.bean.Cat;
import www.github.ybqdren.bean.Dog;
import www.github.ybqdren.dao.DemoDao;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class IOCTest {

    // bean 的延迟查找


    // 使用现有方法对bean缺失时进行补偿
    @Test
    public void test_lookupapplication_immediatly(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc-imme.xml");
        Cat cat = ctx.getBean(Cat.class);
        assertNotNull(cat);
        System.out.println(cat);

        Dog dog;

        try {
            dog = ctx.getBean(Dog.class);
        }catch (NoSuchBeanDefinitionException e){
            // 找不到 Dog 时手动创建
            dog = new Dog();
        }

        assertNotNull(dog);
        System.out.println(dog);
    }

    // 改良-获取之前先检查
    @Test
    public void test_lookupapplication_immediatly_optim(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc-imme.xml");
        Cat cat = ctx.getBean(Cat.class);
        assertNotNull(cat);
        System.out.println(cat);

        Dog dog = ctx.containsBean("dog")?(Dog)ctx.getBean("dog") : new Dog();

        assertNotNull(dog);
        System.out.println(dog);
    }

    // 改良2-延迟查找-将bean包装起来
    @Test
    public void test_lookupapplication_immediatly_optim2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc-imme.xml");
        Cat cat = ctx.getBean(Cat.class);
        assertNotNull(cat);
        System.out.println(cat);

        ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);
        assertNull(dogProvider.getIfAvailable());

        assertThrows(
                NoSuchBeanDefinitionException.class,
                ()->{
                    dogProvider.getObject();
                }
        );
    }

    // 延迟查找-方案实现
    @Test
    public void test_lookupapplication_immediatly_optim3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc-imme.xml");
        Cat cat = ctx.getBean(Cat.class);
        assertNotNull(cat);
        System.out.println(cat);

        ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);
        assertNull(dogProvider.getIfAvailable());


        Dog dog = dogProvider.getIfAvailable();
        if(dog == null){
            dog = new Dog();
        }


        dog = dogProvider.getIfAvailable(() -> new Dog());
        dog = dogProvider.getIfAvailable(Dog::new);
        dogProvider.ifAvailable(dogd -> System.out.println(dogd));
    }

    // 根据注解类获取 bean
    @Test
    public void test_applicationcontext_getbeanswithannotation_all(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc-anno.xml");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
        assertTrue(beanNames.length == 3);
    }

    @Test
    public void test_applicationcontext_getbeanswithannotation(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc-anno.xml");
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Color.class);
        Assertions.assertNotNull(beans);

        beans.forEach((beanName , bean)->{
            System.out.println(beanName + "-" + bean);
        });

        assertTrue(beans.size() == 2);
    }

    @Test
    public void test_applicationcontext(){
        // ApplicationContext 可以一次性获取多个 bean
        ApplicationContext factory = new ClassPathXmlApplicationContext("ioc.xml");
        Map<String, DemoDao> beans = factory.getBeansOfType(DemoDao.class);

        beans.forEach((beanName , bean)->{
            System.out.println(beanName + ":" + bean);
        });

        assertNotNull(beans);
        assertTrue(beans.size() >= 1);
    }
}
