package wzbsdb.pattern.singleton;

/**
 * 饿汉方式(线程安全):指全局的单例实例在类装载时构建
 * 所谓 “饿汉方式” 就是说JVM在加载这个类时就马上创建此唯一的单例实例，不管你用不用，先创建了再说，
 * 如果一直没有被使用，便浪费了空间，典型的空间换时间，每次调用的时候，就不需要再判断，节省了运行时间。
 *
 * @author Surging
 * @create 2018/10/30
 * @since 1.0.0
 */
public class Singleton01 {
    //在静态初始化器中创建单例实例，这段代码保证了线程安全
    private static Singleton01 uniqueInstance = new Singleton01();

    //Singleton类只有一个构造方法并且是被private修饰的，所以用户无法通过new方法创建该对象实例
    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton01 singleton = Singleton01.getInstance();
        Singleton01 singleton2 = Singleton01.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
        if (singleton.equals(singleton2)) {
            System.out.println("singleton代表同一个实例");
        } else {
            System.out.println("singleton不代表同一个实例");
        }
    }
}
