package www.github.ybqdren.annotation;


import java.lang.annotation.*;


/**
 * 使用注解来查找对应的 bean
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Color {

}
