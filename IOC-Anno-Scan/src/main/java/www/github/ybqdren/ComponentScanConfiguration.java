package www.github.ybqdren;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("www.github.ybqdren.bean") // 如果不指定扫描路径，默认扫描本类所在包及子包
public class ComponentScanConfiguration {
}
