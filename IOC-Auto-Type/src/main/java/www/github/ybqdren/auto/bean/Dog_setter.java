package www.github.ybqdren.auto.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * setter 注入
 *
 * @author zhao wen
 * @sice 2022/7/12
 **/

@ToString
@Component
public class Dog_setter {

    @Value("dogdog")
    private String name;

    private Person person;

    @Autowired
    public void setPerson(Person person){
        this.person = person;
    }
}
