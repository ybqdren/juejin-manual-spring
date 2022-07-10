package www.github.ybqdren.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhao wen
 * @sice 2022/7/10
 **/
@Component
public class Green {

    // 直接拿 Blue 的 name 贴过来
    @Value("#{'copy of ' + blue.name}")
    private String name;

    // order 属性希望它比 blue 的 order 大 1
    @Value("#{blue.order + 1}")
    private Integer order;
}
