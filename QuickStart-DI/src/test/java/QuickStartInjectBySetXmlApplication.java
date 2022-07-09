import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import www.github.ybqdrem.bean.Cat;
import www.github.ybqdrem.bean.Person;
import www.github.ybqdrem.dao.impl.DemoOracleDaoImpl;
import www.github.ybqdrem.service.impl.DemoServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuickStartInjectBySetXmlApplication {

    // todo 待解决

    /**
     * .factory.BeanCreationException:
     * Error creating bean with name 'demoService' defined in class path
     * resource [inject-set3.xml]: Instantiation of bean failed;
     * nested exception is org.springframework.beans.BeanInstantiationException:
     * Failed to instantiate [www.github.ybqdrem.service.impl.DemoServiceImpl]:
     * Constructor threw exception; nested exception is java.lang.ExceptionInInitializerErroro
     */
    @Test
    public void test_inject_service_and_dao() {
        BeanFactory factory = new ClassPathXmlApplicationContext("inject-set3.xml");
        Object demoDao = factory.getBean(DemoOracleDaoImpl.class);
        assertNotNull(demoDao);

        Object demoService = factory.getBean(DemoServiceImpl.class);
        assertNotNull(demoService);
    }

    @Test
    public void test_inject_by_set_2_xml() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("inject-set2.xml");
        Person person = beanFactory.getBean(Person.class);
        assertNotNull(person);


        assertEquals(person.getName(), "test-person-byset");
        assertEquals(person.getAge(), 18);

        Cat cat = beanFactory.getBean(Cat.class);
        assertNotNull(cat);

        assertEquals(cat.getName(), "test-cat");
        assertEquals(cat.getMaster(), person);
    }

    @Test
    public void test_inject_by_set_xml() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        assertNotNull(person);

        Cat cat = beanFactory.getBean(Cat.class);
        assertNotNull(cat);
    }
}
