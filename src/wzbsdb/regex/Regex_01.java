package wzbsdb.regex;

/**
 * 〈一句话功能简述〉<br>
 *  正则表达式 字符类
 *
 * @author Surging
 * @create 2018/9/18
 * @since 1.0.0
 */
public class Regex_01 {

    /**
     * 字符类
     * [abc]	a、b 或 c（简单类）
     * [^abc]	任何字符，除了 a、b 或 c（否定）
     * [a-zA-Z]	a 到 z 或 A 到 Z，两头的字母包括在内（范围）
     * [a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]（并集）
     * [a-z&&[def]]	d、e 或 f（交集）
     * [a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去）
     * [a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
     */
    public static void main(String[] args) {
        String regex = "[a-zA-Z]";
        System.out.println("a".matches(regex));     // true
        System.out.println("d".matches(regex));     // true
        System.out.println("1".matches(regex));     // false
    }

    private static void demo2() {
        String regex = "[^abc]";
        System.out.println("a".matches(regex));     // false
        System.out.println("d".matches(regex));     // true
        System.out.println("1".matches(regex));     // true
        System.out.println("10".matches(regex));     // false   这不是单个字符
    }

    private static void demo1() {
        String regex = "[abc]";
        System.out.println("a".matches(regex));     // true
        System.out.println("ac".matches(regex));    // false
        System.out.println("a3".matches(regex));    // false
        System.out.println("j".matches(regex));     // false
    }
}
