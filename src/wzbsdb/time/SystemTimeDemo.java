package wzbsdb.time;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class SystemTimeDemo {
    public static void main(String[] args) {
        //返回以毫秒为单位的当前时间
        long milliSecond = System.currentTimeMillis();
        System.out.println(milliSecond);
        //同上 返回以毫秒为单位的当前时间
        long time =  new Date().getTime();
        System.out.println(time);
        //同上 返回以毫秒为单位的当前时间
        Long milliSecond2 = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(milliSecond2);
        //提供相对精确的计时，但是不能用他来计算当前日期  用途可以产生随机数
        long random = System.nanoTime();
        System.out.println(random);
    }
}
