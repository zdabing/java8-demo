package wzbsdb.pattern.factory;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        //factory();
        Circle circle = (Circle) ShapeFactory2.getClass(wzbsdb.pattern.factory.Circle.class);
        circle.draw();

        Rectangle rectangle = (Rectangle) ShapeFactory2.getClass(wzbsdb.pattern.factory.Rectangle.class);
        rectangle.draw();

        Square square = (Square) ShapeFactory2.getClass(wzbsdb.pattern.factory.Square.class);
        square.draw();
    }

    private static void factory() {
        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // 获取 Square 的对象，并调用它的 draw 方法
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }
}
