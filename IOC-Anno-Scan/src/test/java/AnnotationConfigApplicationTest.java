import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import www.github.ybqdren.ComponentScanConfiguration;
import www.github.ybqdren.QuickstartConfiguration;
import www.github.ybqdren.bean.Cat;
import www.github.ybqdren.bean.Person;

import java.util.stream.Stream;

public class AnnotationConfigApplicationTest {


    /**
     org.springframework.context.annotation.internalConfigurationAnnotationProcessor
     org.springframework.context.annotation.internalAutowiredAnnotationProcessor
     org.springframework.context.event.internalEventListenerProcessor
     org.springframework.context.event.internalEventListenerFactory
     componentScanConfiguration
     miamia

     */
    // 去掉后面的bean ,扫描整个根包
    @Test
    public void test_annotation_configuration(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Assertions.assertTrue(beanDefinitionNames.length >= 1);
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }


    // 初始化注解 IOC 容器
    // 不使用 componentScan 扫描
    @Test
    public void test_annotaionconfig_pathstring(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext("www.github.ybqdren.bean");

        Cat cat = ctx.getBean(Cat.class);
        Assertions.assertNotNull(cat);
        System.out.println(cat);

    }



    @Test
    public void test_annotaionconfig_configuration(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);

        Cat cat = ctx.getBean(Cat.class);
        Assertions.assertNotNull(cat);
        System.out.println(cat);

    }

    @Test
    public void test_annotaionconfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);

        Person person = ctx.getBean(Person.class);
        System.out.println(person);

        Assertions.assertNotNull(person);
    }
}
