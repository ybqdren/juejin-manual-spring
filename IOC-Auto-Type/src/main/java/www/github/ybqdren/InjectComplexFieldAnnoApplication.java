package www.github.ybqdren;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import www.github.ybqdren.auto.bean.Dog_cons;

/**
 * @author zhao wen
 * @sice 2022/7/12
 **/
public class InjectComplexFieldAnnoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("www.github.ybqdren.auto.bean");
        Dog_cons dog = ctx.getBean(Dog_cons.class);
        System.out.println(dog);
    }
}
