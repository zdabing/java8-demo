package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute1(5,i -> i * 2,i -> i * i));//50
        System.out.println(functionTest.compute2(5,i -> i * 2,i -> i * i));//100
        List<Integer> student = Arrays.asList(55,2,3,4,5,6);
        int[] array = {66,55,22,44,62,85};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //List排序
        List<Integer> sort= student.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
        //倒叙
        List<Integer> ace = student.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ace);
    }

    public int compute1(int i, Function<Integer,Integer> after, Function<Integer,Integer> before){
        return after.compose(before).apply(i);
    }

    public int compute2(int i, Function<Integer,Integer> before,Function<Integer,Integer> after){
        return before.andThen(after).apply(i);
    }
}
