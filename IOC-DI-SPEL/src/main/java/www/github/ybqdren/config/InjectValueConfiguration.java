package www.github.ybqdren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhao wen
 * @sice 2022/7/10
 **/

@Configuration
// 顺便加上包扫描
@ComponentScan("www.github.ybqdren.bean")
@PropertySource("classpath:red-spel.properties")
public class InjectValueConfiguration {
}
