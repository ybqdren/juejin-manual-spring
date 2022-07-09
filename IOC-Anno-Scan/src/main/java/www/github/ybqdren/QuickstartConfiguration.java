package www.github.ybqdren;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import www.github.ybqdren.bean.Person;

/**
 * 注解驱动使用的驱动类
 */

@Configuration
public class QuickstartConfiguration {

    /**
     * 相当于 xml：
     * <bean id="person" class="www.github.ybqdren.bean.Person">
     * <property> name="name" value = "3333"</property>
     * <property> name="age" value = "3333"</property>
     *
     * </bean>
     * 在注解驱动的范畴中，id叫做name（4.3.3之后可以直接写作value）
     */
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("3333");
        person.setAge(3333);
        return person;
    }
}
