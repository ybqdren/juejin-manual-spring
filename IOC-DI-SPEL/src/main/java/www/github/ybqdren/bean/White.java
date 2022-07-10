package www.github.ybqdren.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhao wen
 * @sice 2022/7/10
 **/
@Component
public class White {

    // 直接引用类的属性，需要在类的全限定名外面使用 T() 包围
    // spel 文档 https://link.juejin.cn/?target=https%3A%2F%2Fdocs.spring.io%2Fspring%2Fdocs%2F5.2.x%2Fspring-framework-reference%2Fcore.html%23expressions

    /**
     xml 中也是用 value 属性：
     <bean class="com.linkedbear.spring.basic_di.c_value_spel.bean.White">
     <property name="name" value="#{blue.name.substring(0, 3)}"/>
     <property name="order" value="#{T(java.lang.Integer).MAX_VALUE}"/>
     </bean>
     */
    @Value("#{blue.name.substring(0, 3)}")
    private String name;

    @Value("#{T(java.lang.Integer).MAX_VALUE}")
    private Integer order;
}
