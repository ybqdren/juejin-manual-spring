package www.github.ybqdren.bytype.factory;

import www.github.ybqdren.bytype.dao.DemoDao;

/**
 * 解决紧耦合：反射
 *
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class BeanFactory {
    public static DemoDao getDemoDao() {
        try {
            return (DemoDao) Class.forName("com.linkedbear.architecture.c_reflect.dao.impl.DemoDaoImpl").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
        }
    }
}
