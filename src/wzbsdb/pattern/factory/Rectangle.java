package wzbsdb.pattern.factory;

/**
 * 长方形
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class Rectangle implements Shape{
    public Rectangle() {
        System.out.println("Circle");
    }
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
