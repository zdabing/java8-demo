package time.date;

import java.util.Calendar;
import java.util.Date;

public class Calendar01 {
    public static void main(String[] args) {
        //获取当前时间
        Calendar now = Calendar.getInstance();
        //date跟long之间互转
        Date date = now.getTime();
        System.out.println(date);
        long date1 = now.getTime().getTime();
        System.out.println(date1);
        System.out.println(now.get(Calendar.YEAR));
    }
}
