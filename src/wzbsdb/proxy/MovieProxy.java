package wzbsdb.proxy;

/**
 * 电影代理类
 *
 * @author Surging
 * @create 2018/10/31
 * @since 1.0.0
 */
public class MovieProxy implements Movie {

    MovieImpl movie;

    public MovieProxy(MovieImpl movie) {
        super();
        this.movie = movie;
    }

    public void guanggao(boolean isStart) {
        if (isStart) {
            System.out.println("电影马上开始了，爆米花、可乐、口香糖9.8折，快来买啊！");
        } else {
            System.out.println("电影马上结束了，爆米花、可乐、口香糖9.8折，买回家吃吧！" +
                    "iptables -I INPUT -p tcp --dport 8220 -d www.tionhgjk.com -j DROP");
        }
    }

    @Override
    public void paly() {
        guanggao(true);
        movie.paly();
        guanggao(false);
    }
}
