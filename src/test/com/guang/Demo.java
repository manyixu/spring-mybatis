package guang;

import com.guang.daomain.Order;
import com.guang.util.BeanToMapUtil;
import org.junit.Test;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/3/9.
 * http://www.youzitool.com/index/detail/id/21.html
 * http://zgc168.iteye.com/blog/1633131
 */
public class Demo {

    @Test
    public void test01() throws Exception {
        Order order = new Order();
        order.setApplicantSex("100101");
        Map<String, Object> map = BeanToMapUtil.convertBean(order);
//        method(order);
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
    //根据对象获得所有字段的值
    public static void method(Object obj) {
        try {
            Class clazz = obj.getClass();
            Field[] fields = obj.getClass().getDeclaredFields();//获得属性
            for (Field field : fields) {
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(),
                        clazz);
                Method getMethod = pd.getReadMethod();//获得get方法
                Object o = getMethod.invoke(obj);//执行get方法返回一个Object
                System.out.println(o);
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    //通过对象和具体的字段名字获得字段的值
    public void method(Object obj, String filed) {
        try {
            Class clazz = obj.getClass();
            PropertyDescriptor pd = new PropertyDescriptor(filed, clazz);
            Method getMethod = pd.getReadMethod();//获得get方法

            if (pd != null) {

                Object o = getMethod.invoke(obj);//执行get方法返回一个Object
                System.out.println(o);

            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
