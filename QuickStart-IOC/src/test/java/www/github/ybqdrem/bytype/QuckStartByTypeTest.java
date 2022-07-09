package www.github.ybqdrem.bytype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import www.github.ybqdrem.byname.bean.Person;
import www.github.ybqdrem.bytype.dao.DemoDao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class QuckStartByTypeTest {
    @Test
    public void test_quickstartby_demodaoimpl() {
        BeanFactory factory = new ClassPathXmlApplicationContext("quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);
        assertNotNull(person);

        DemoDao demoDao = factory.getBean(DemoDao.class);
        assertNotNull(demoDao.findAll());
    }

    @Test
    public void test_bytype_withxml() {
        // www.github.ybqdrem.byname.bean.Person@13b32d7
        BeanFactory factory = new ClassPathXmlApplicationContext("quickstart-byname.xml");
        Object person = factory.getBean(Person.class);
        assertNotNull(person);
    }
}
