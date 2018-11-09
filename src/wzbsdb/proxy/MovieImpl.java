package wzbsdb.proxy;

/**
 * 一个真正的实现这个 Movie 接口的类
 *
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class MovieImpl implements Movie{
    @Override
    public void paly() {
        System.out.println("您正在观看电影 《肖申克的救赎》");
    }
}
