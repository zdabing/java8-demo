package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        //关联到当前默认时区
        ZonedDateTime bj = now.atZone(ZoneId.systemDefault());
        System.out.println(bj);
        //关联到纽约时区
        ZonedDateTime ny = now.atZone(ZoneId.of("America/New_York"));
        System.out.println(ny);
        //时区转换
        //关联到纽约时区
        ZonedDateTime nyTime = bj.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(nyTime);
        //指定区域获取时间
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(london);
    }
}
