package wzbsdb.time;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 * java8引入了一套全新的时间日期API。
 * SQL -> Java
 * --------------------------
 * date -> LocalDate
 * time -> LocalTime
 * timestamp -> LocalDateTime
 */
public class TimeDemo {

        public static void main(String[] args) {

                // 取当前日期 无法包含时间
                LocalDate now = LocalDate.now();
                System.out.println(now);
                //取当前时间 无法包含日期 清除毫秒数
                LocalTime localTime = LocalTime.now().withNano(0);
                System.out.println(localTime);
                //同时包含日期和时间
                LocalDateTime localDateTime = LocalDateTime.now();
                System.out.println(localDateTime);

                // 根据年月日取日期，12月就是12：
                LocalDate localDate = LocalDate.of(2017, 6, 1);
                localDate.getYear();//年
                localDate.getMonth();//月
                localDate.getDayOfMonth();//日
                localDate.getDayOfYear();//年中的第几天
                System.out.println(localDate);

                //严格按照ISO yyyy-MM-dd验证，02写成2都不行，当然也有一个重载方法允许自己定义格式
                LocalDate endOfFeb = LocalDate.parse("2017-01-11");
                System.out.println(endOfFeb);
                //获取秒数
                Long second = localDateTime.toEpochSecond(ZoneOffset.of("+8"));
                System.out.println(second);
                //获取毫秒数
                Long milliSecond = localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
                System.out.println(milliSecond);

                // 取本月第1天：
                LocalDate firstDayOfThisMonth = now.with(TemporalAdjusters.firstDayOfMonth());
                System.out.println(firstDayOfThisMonth);
                // 取本月第2天：
                LocalDate secondDayOfThisMonth = now.withDayOfMonth(2);
                System.out.println(secondDayOfThisMonth);

                // 取本月最后一天，再也不用计算是28，29，30还是31：
                LocalDate lastDayOfThisMonth = now.with(TemporalAdjusters.lastDayOfMonth());
                System.out.println(lastDayOfThisMonth);
                // 取下一天：
                LocalDate nextDay = now.plusDays(1);
                System.out.println(lastDayOfThisMonth);

                // 取2018年1月第一个周一，这个计算用Calendar要死掉很多脑细胞：
                LocalDate firstMondayOf2018 = LocalDate.parse("2018-01-01").with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
                System.out.println(firstMondayOf2018);

                //上一个月这一天
                LocalDate upMonth = now.minusMonths(1);
                System.out.println(upMonth);

        }
}
