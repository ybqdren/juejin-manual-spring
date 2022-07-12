package www.github.ybqdren.auto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import www.github.ybqdren.auto.bean.Cat;
import www.github.ybqdren.auto.bean.Person;

/**
 * @author zhao wen
 * @sice 2022/7/12
 **/

@Configuration
@ComponentScan("www.github.ybqdren.auto.bean")
public class InjectComplexFieldConfiguration {

    @Bean
    public Cat cat(Person person){
        Cat cat = new Cat();
        cat.setName("mini");
        cat.setMaster(person);
        return cat;
    }
}
