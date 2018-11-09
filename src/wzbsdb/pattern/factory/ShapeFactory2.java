package wzbsdb.pattern.factory;

/**
 * 创建工厂类
 * 采用反射改造
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class ShapeFactory2 {

    // 使用 getShape 方法获取形状类型的对象
    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
