package www.github.ybqdrem.dao.impl;


import www.github.ybqdrem.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/
public class DemoOracleDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        // 模拟修改SQL的动作
        return Arrays.asList("oracle", "oracle", "oracle");
    }
}
