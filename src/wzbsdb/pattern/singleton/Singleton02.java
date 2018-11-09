package wzbsdb.pattern.singleton;

/**
 * 懒汉方式(线程安全):指全局的单例实例在第一次被使用时构建。
 * 所谓 “ 懒汉式” 就是说单例实例在第一次被使用时构建，而不是在JVM在加载这个类时就马上创建此唯一的单例实例。
 *
 * @author Surging
 * @create 2018/10/30
 * @since 1.0.0
 */
public class Singleton02 {

    private static Singleton02 uniqueInstance;

    private Singleton02() {
    }

    //没有加入synchronized关键字的版本是线程不安全的
    public static synchronized Singleton02 getInstance() {
        //判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton02();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton02 singleton = Singleton02.getInstance();
        Singleton02 singleton2 = Singleton02.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
        if (singleton.equals(singleton2)) {
            System.out.println("singleton代表同一个实例");
        } else {
            System.out.println("singleton不代表同一个实例");
        }
    }
}
