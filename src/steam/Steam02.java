package steam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Steam02{
    public static void main(String[] args) {
        //第一种 通过Stream接口的of静态方法创建一个流
        Stream<String> stream = Stream.of("hello", "world", "helloworld");
        //第二种 通过Arrays类的stream方法，实际上第一种of方法底层也是调用的Arrays.stream(values);
        String[] array = new String[]{"hello","world","helloworld"};
        Stream<String> stream3 = Arrays.stream(array);
        //第三种 通过集合的stream方法，该方法是Collection接口的默认方法，所有集合都继承了该方法
        Stream<String> stream2 = Arrays.asList("hello","world","helloworld").stream();

        List<String> list = Arrays.asList("hello", "world", "helloworld");
        List<String> upList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upList);
        Stream<List<Integer>> listStream =
                Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        List<Integer> collect1 = listStream.flatMap(e -> e.stream()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);
        //同时获取最大 最小 平均值等信息
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 11);
        IntSummaryStatistics statistics = list1.stream().mapToInt(e -> e).summaryStatistics();
        System.out.println(statistics.getMax());//18
        System.out.println(statistics.getMin());//14
        System.out.println(statistics.getAverage());//16
        Stream.generate(UUID.randomUUID()::toString).findFirst().ifPresent(System.out::println);
        //从1开始，每个元素比前一个元素大2，最多生成10个元素
        Stream.iterate(1,item -> item + 2).limit(10).forEach(System.out::println);
    }
}
