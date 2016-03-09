package guang;

import com.guang.daomain.Order;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/3/9.
 * http://www.youzitool.com/index/detail/id/21.html
 */
public class Demo {

    @Test
    public void test01() throws Exception {
        Order order = new Order();
        order.setApplicantSex("100101");
        Map<String, Object> map = reflectObj(order);
        System.out.println(map.toString());
    }

    public Map<String, Object> reflectObj(Object obj) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            String name = fields[i].getName();
            String tmpName = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法
            String type = fields[i].getGenericType().toString(); // 获取属性的类型
            if (type.equals("class java.lang.String")) {
                Method m = obj.getClass().getMethod("get" + tmpName);
                String value = (String) m.invoke(obj); // 调用getter方法获取属性值
                map.put(name, value);
            }
        }
        return map;
    }
}
