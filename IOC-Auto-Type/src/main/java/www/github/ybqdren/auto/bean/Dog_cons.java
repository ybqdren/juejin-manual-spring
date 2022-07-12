package www.github.ybqdren.auto.bean;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * 构造器注入
 * @author zhao wen
 * @sice 2022/7/12
 **/

@ToString
@Getter
@Component
public class Dog_cons {

    @Value("dogdog")
    private String name;

    private Person person;

    @Autowired
    public Dog_cons(Person person) {
        this.person = person;
    }
}
