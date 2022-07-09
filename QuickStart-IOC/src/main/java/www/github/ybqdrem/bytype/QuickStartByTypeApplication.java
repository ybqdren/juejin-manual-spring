package www.github.ybqdrem.bytype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import www.github.ybqdrem.byname.bean.Person;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/

public class QuickStartByTypeApplication {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("quickstart-byname.xml");
        Object person = factory.getBean(Person.class);
        System.out.println(person);
    }
}
