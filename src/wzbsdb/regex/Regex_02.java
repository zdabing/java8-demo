package wzbsdb.regex;

/**
 * 〈一句话功能简述〉<br>
 *  正则表达式 数字类
 *
 * @author Surging
 * @create 2018/9/18
 * @since 1.0.0
 */
public class Regex_02 {
    /*   预定义字符类
    .	任何字符（与行结束符可能匹配也可能不匹配）
    \d	数字：[0-9]
    \D	非数字： [^0-9]
    \s	空白字符：[ \t\n\x0B\f\r]
    \S	非空白字符：[^\s]
    \w	单词字符：[a-zA-Z_0-9]
    \W	非单词字符：[^\w]     */
    public static void main(String[] args) {
        //demo1();
        String regex = "\\d";            //  \代表转义字符    需要用 \\ 来表示
        System.out.println("0".matches(regex));     // true
        System.out.println("99".matches(regex));     // false
        System.out.println("9".matches(regex));     // true

    }

    private static void demo1() {
        String regex = ".";
        System.out.println("a".matches(regex));     // true
        System.out.println("ab".matches(regex));     // false
        System.out.println("1v".matches(regex));     // false
    }
}
