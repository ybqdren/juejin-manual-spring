package www.github.ybqdren.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import www.github.ybqdren.bean.Person;

/**
 * @author zhao wen
 * @sice 2022/7/10
 **/

@Configuration
public class BeanAutoConfiguration {

    @Bean("person2")
    public Person person(){
        return new Person("lisi" , 30);
    }
}
