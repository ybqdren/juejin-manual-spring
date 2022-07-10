package www.github.ybqdren.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhao wen
 * @sice 2022/7/10
 **/


@Component
@ToString
@Data
public class Red {
    @Value("${red.name}")
    private String name;
    @Value("${red.order}")
    private Integer order;

}
