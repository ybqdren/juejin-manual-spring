package www.github.ybqdren.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 Component 相当于 xml bean 中的 class
 */
@Data
@Component("miamia")
public class Cat {
    private String name;
    private Person master;

}
