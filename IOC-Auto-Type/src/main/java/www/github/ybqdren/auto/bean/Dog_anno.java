package www.github.ybqdren.auto.bean;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 注解注入
 *
 * @author zhao wen
 * @sice 2022/7/12
 **/

@ToString
@Getter
@Component
public class Dog_anno {

    @Value("dogdog")
    private String name;

    @Autowired(required = false)
    private Person person;
}
