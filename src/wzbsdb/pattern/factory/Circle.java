package wzbsdb.pattern.factory;

/**
 * 圆形
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class Circle implements Shape {
    public Circle() {
        System.out.println("Circle");
    }
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
