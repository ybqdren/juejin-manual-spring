package www.github.ybqdren.bean;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhao wen
 * @sice 2022/7/10
 **/


// 注解式注入

@Component
@ToString
@Getter
public class Black {
    @Value("black-value-anno")
    private String name;
    @Value("0")
    private Integer order;
}
