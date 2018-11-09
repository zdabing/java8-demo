package wzbsdb.thread.day01;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Surging
 * @create 2018/10/30
 * @since 1.0.0
 */
public class MyList {

    private static List<String> list = new ArrayList<>();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}
