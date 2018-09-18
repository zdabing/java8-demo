package collection;

import java.util.*;
import java.util.stream.Collectors;

public class Set01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,6,4,2,6,7,3,1,9);
        //如果我们需要迭代的顺序为插入顺序或者访问顺序，那么 LinkedHashSet 是需要你首先考虑的。
        Set<Integer> set = new LinkedHashSet<>();
        list.stream().forEach(e -> set.add(e));
        System.out.println(set);
        Set<Integer> set01 = new HashSet<>();
        list.stream().forEach(e -> set01.add(e));
        System.out.println(set01);
        Set<Integer> set02 = new TreeSet<>();
        list.stream().forEach(e -> set02.add(e));
        System.out.println(set01);
    }
}
