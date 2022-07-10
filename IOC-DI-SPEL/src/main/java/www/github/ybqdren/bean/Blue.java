package www.github.ybqdren.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * spel 表達式
 *
 * @author zhao wen
 * @sice 2022/7/10
 **/


@Data
@Component
public class Blue {

    @Value("#{'blue-value-byspel'}")
    private String name;

    @Value("#{2}")
    private Integer order;
}
