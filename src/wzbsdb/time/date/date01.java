package wzbsdb.time.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date01 {
    public static void main(String[] args) {
        //获取当前时间
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.toInstant());
        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(now));
        //Date转化为long
        long t = now.getTime();
        System.out.println(t);
        //获取系统当前时间搓
        System.out.println(System.currentTimeMillis());
        //long转化为Date
        System.out.println(new Date(t));
    }
}
