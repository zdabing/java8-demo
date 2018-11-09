package wzbsdb.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Formatter01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //转换格式
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(now));

        //判断日期先后
        LocalDate d1 = LocalDate.parse("2018-11-21");
        LocalDate d2 = LocalDate.parse("2015-11-21");
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isBefore(d2));

        //比较两个日期之间间隔天数
        Period between = Period.between(d1,d2);
        System.out.println(between.getDays());
        System.out.println(between.getMonths());
        System.out.println(between.getYears());

        //两个时间具体间隔天数
        System.out.println(d1.toEpochDay() - d2.toEpochDay());

        //两天
        Period towDays = Period.ofDays(2);
        //一个小时
        Duration oneHour = Duration.ofHours(1);
        Duration halfHour = Duration.ofMinutes(30);
        LocalDateTime localDateTime = now.minus(towDays).plus(oneHour).minus(halfHour);
        System.out.println(df.format(localDateTime));
    }
}
