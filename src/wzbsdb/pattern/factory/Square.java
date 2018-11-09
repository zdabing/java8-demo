package wzbsdb.pattern.factory;

/**
 * 正方形
 *
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class Square implements Shape {

    public Square(){
        System.out.println("Square");
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
