package c;

import com.github.ybqdren.c.factory.BeanFactory2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class BeanFactory2Test {


    @Test
    public void test_getbean_equal(){
        Object demoDao1 = BeanFactory2.getBean("demoDao");
        Object demoDao2 = BeanFactory2.getBean("demoDao");
        Assertions.assertEquals(demoDao1 , demoDao2);
    }
}
