package www.github.ybqdren.byname;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class QuickStartByNameTest {
    @Test
    public void test_byname_withxml(){
        // www.github.ybqdrem.bean.Person@13b32d7
        BeanFactory factory = new ClassPathXmlApplicationContext("quickstart-byname.xml");
        Object person = factory.getBean("person");
        Assertions.assertNotNull(person);
    }
}
