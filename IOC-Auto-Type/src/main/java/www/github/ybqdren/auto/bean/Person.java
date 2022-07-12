package www.github.ybqdren.auto.bean;

import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author zhao wen
 * @sice 2022/7/12
 **/

@Setter
@ToString
@Component
public class Person {
    private String name = "administrator";
}
