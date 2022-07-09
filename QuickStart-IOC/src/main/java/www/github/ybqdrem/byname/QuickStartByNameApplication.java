package www.github.ybqdrem.byname;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/

public class QuickStartByNameApplication {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("quickstart-byname.xml");
        Object person = factory.getBean("person");
        System.out.println(person);
    }
}
