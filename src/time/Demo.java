package time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * 某航线从北京飞到纽约需要12小时15分钟，请根据起飞日期和时间计算到达纽约的当地日期和时间
 */
public class Demo {
    public static void main(String[] args) {
        //方法1
        /*DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("2016-12-01 07:50:00",df);
        System.out.println(localDateTime);*/

        //方法2
        /*LocalDate d1 = LocalDate.of(2016,12,01);
        LocalTime t1 = LocalTime.of(07,50,00);
        LocalDateTime start = LocalDateTime.of(d1,t1);*/
        //方法三
        LocalDateTime localDateTime = LocalDateTime.of(2016,12,01,07,50,00);
        //关联到北京时间
        ZonedDateTime bj = localDateTime.atZone(ZoneId.of("Asia/Shanghai"));
        //转换纽约时区
        ZonedDateTime ny = bj.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime zonedDateTime = ny.plusHours(12).plusMinutes(15);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(zonedDateTime));
    }
}
