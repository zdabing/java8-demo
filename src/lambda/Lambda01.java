package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda01 {
    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        //Lambda表达式 接收一个参数 不返回值
        list.forEach(System.out::println);*/
        Lambda01 lambda01 = new Lambda01();
        //参数也可是是一个Lambda表达式
        System.out.println(lambda01.compute(2,e -> e+2));
        System.out.println(lambda01.compute(2,e -> e*2));
        Predicate<String> predicate = s -> s.length() > 5 ;
        System.out.println(predicate.test("hellll"));
        Supplier<Integer> supplier = () -> lambda01.compute(5,e -> e*5);
        System.out.println(supplier.get());
    }
    //参数可以为lambda表达式
    public int compute(int i , Function<Integer,Integer> function){
        Integer result = function.apply(i);
        return result;

    }
}
