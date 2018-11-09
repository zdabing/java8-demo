package wzbsdb.regex;

/**
 * 〈一句话功能简述〉<br>
 *  Greedy 数量词
 * @author Surging
 * @create 2018/9/18
 * @since 1.0.0
 */
public class Regex_03 {

    /*
    X?	X，一次或一次也没有
    X*	X，零次或多次
    X+	X，一次或多次
    X{n}	X，恰好 n 次
    X{n,}	X，至少 n 次
    X{n,m}	X，至少 n 次，但是不超过 m 次
    */

    public static void main(String[] args) {
        //demo1();
        String regex = "[abc]*";
        System.out.println("0".matches(regex));     // false
        System.out.println("a".matches(regex));     // true
        System.out.println("abc".matches(regex));     // true
        System.out.println("".matches(regex));       // true  一次也没有
    }

    private static void demo1() {
        String regex = "[abc]?";
        System.out.println("0".matches(regex));     // false
        System.out.println("a".matches(regex));     // true
        System.out.println("abc".matches(regex));     // false
        System.out.println("".matches(regex));       // true  一次也没有
    }
}
