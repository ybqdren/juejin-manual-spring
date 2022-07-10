package www.github.ybqdren;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import www.github.ybqdren.bean.*;
import www.github.ybqdren.config.BeanAutoConfiguration;
import www.github.ybqdren.config.InjectValueConfiguration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhao wen
 * @sice 2022/7/10
 **/
public class ConstructorTest {

    // spel
    @Test
    public void test_prop_di_color(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Green color = ctx.getBean(Green.class);
        assertNotNull(color);
        System.out.println("properties value : " + color);
    }

    @Test
    public void test_prop_di_blue(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Blue blue = ctx.getBean(Blue.class);
        assertNotNull(blue);
        System.out.println("properties value : " + blue);
    }


    // properties 注入
    @Test
    public void test_prop_di(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Red red = ctx.getBean(Red.class);
        assertNotNull(red);
        System.out.println("properties value : " + red);
        assertEquals(red.getName() , "red-value-byproperties");
        assertEquals(red.getOrder() , 1);
    }

    // 组件扫描
    @Test
    public void test_componentscan(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("www.github.ybqdren.bean");
        Black bean = ctx.getBean(Black.class);
        assertNotNull(bean);
        System.out.println(bean);
        assertEquals(bean.getName() , "black-value-anno");
        assertEquals(bean.getOrder() , 0);
    }


    // 注解式构造器属性注入
    @Test
    public void test_constructor_bybeananno() {
        ApplicationContext factory = new AnnotationConfigApplicationContext(BeanAutoConfiguration.class);
        Object person = factory.getBean(Person.class);
        assertNotNull(person);

        assertDoesNotThrow(() -> {
            if (person instanceof Person pe) {
                System.out.println(pe);
            } else {
                throw new RuntimeException();
            }
        });
    }


    // xml 方式构造器注入
    @Test
    public void test_constructor_byxml() {
        BeanFactory factory = new ClassPathXmlApplicationContext("di-constructor.xml");
        Person bean = factory.getBean(Person.class);
        assertNotNull(bean);
        assertEquals(bean.getName(), "zhangsan");
        assertEquals(bean.getAge(), 19);
    }
}
