package wzbsdb.pattern.singleton;

/**
 *  懒汉式(双重检查加锁版本)
 *  这种方式相比于使用synchronized关键字的方法，可以大大减少getInstance() 的时间消费。
 * @author Surging
 * @create 2018/10/30
 * @since 1.0.0
 */
public class Singleton03 {
    //volatile保证，当uniqueInstance变量被初始化成Singleton实例时，多个线程可以正确处理uniqueInstance变量
    private volatile static Singleton03 uniqueInstance;

    private Singleton03(){};

    public static Singleton03 getInstance() {
        //检查实例，如果不存在，就进入同步代码块
        if (uniqueInstance == null) {
            //只有第一次才彻底执行这里的代码
            synchronized(Singleton03.class) {
                //进入同步代码块后，再检查一次，如果仍是null，才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton03();
                }
            }
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton03 singleton = Singleton03.getInstance();
        Singleton03 singleton2 = Singleton03.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
        if (singleton.equals(singleton2)) {
            System.out.println("singleton代表同一个实例");
        } else {
            System.out.println("singleton不代表同一个实例");
        }
    }
}
