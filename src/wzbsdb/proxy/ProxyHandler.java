package wzbsdb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Title: InvocationHandler 的实现
 * Description: 每个代理的实例都有一个与之关联的 InvocationHandler
 * 实现类，如果代理的方法被调用，那么代理便会通知和转发给内部的 InvocationHandler 实现类，由它调用invoke()去处理
 *
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class ProxyHandler implements InvocationHandler {

    //被代理对象
    private Object proxied;

    public ProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在转调具体目标对象之前，可以执行一些功能处理
        System.out.println("前置增强处理： yoyoyo...");

        // 转调具体目标对象的方法(三要素：实例对象 + 实例方法 + 实例方法的参数)
        Object obj = method.invoke(proxied, args);

        // 在转调具体目标对象之后，可以执行一些功能处理
        System.out.println("后置增强处理：hahaha...");

        return obj;
    }
}
