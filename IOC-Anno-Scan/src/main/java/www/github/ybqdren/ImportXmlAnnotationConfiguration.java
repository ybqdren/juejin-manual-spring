package www.github.ybqdren;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 在注解中引入 xml，还需要在xml中开启注解扫描
 */

@Configuration
@ImportResource("classpath:annotation/xmlandanno.xml")
public class ImportXmlAnnotationConfiguration {
}
