package www.github.ybqdren;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import www.github.ybqdren.auto.bean.Cat;
import www.github.ybqdren.auto.bean.Dog_anno;
import www.github.ybqdren.auto.bean.Dog_cons;
import www.github.ybqdren.auto.config.InjectComplexFieldConfiguration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhao wen
 * @sice 2022/7/12
 **/
public class InjectFieldTest {

    @Test
    public void testInjectCat(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        Cat cat = ctx.getBean(Cat.class);
        assertNotNull(cat);
        assertNotNull(cat.getMaster());
    }

    @Test
    public void testNonNullInjection() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("www.github.ybqdren.auto.bean");

        assertDoesNotThrow(() -> {
            Dog_anno dog = ctx.getBean(Dog_anno.class);
            assertNotNull(dog);
            assertNotNull(dog.getPerson());
        });

    }
}
