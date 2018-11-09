package wzbsdb.proxy;

import javax.security.auth.Subject;
import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        /*MovieImpl movieReal = new MovieImpl();
        Movie movie = new MovieProxy(movieReal);
        movie.paly();*/
        // 真实对象real
        Movie real = new MovieImpl();

        // 生成real的代理对象
        Movie proxySubject = (Movie) Proxy.newProxyInstance(
                Movie.class.getClassLoader(), new Class[] { Movie.class },
                new ProxyHandler(real));

        proxySubject.paly();
        System.out.println("代理对象的类型 ： " + proxySubject.getClass().getName());
        System.out.println("代理对象所在类的父类型 ： " + proxySubject.getClass().getGenericSuperclass());
    }
}
