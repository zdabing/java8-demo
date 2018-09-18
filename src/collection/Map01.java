package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"wangli1");
        map.put(2,"wangli2");
        map.put(3,"wangli3");
        map.put(4,"wangli4");
        map.put(1,"wangli---111");
        System.out.println(map.size());
        for (Integer key : map.keySet()){
            System.out.println(map.get(key));
        }
        for (String value : map.values()){
            System.out.println(value);
        }
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //根据Key排序
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"1");
        treeMap.put(3,"3");
        treeMap.put(2,"2");
        for (Integer key : treeMap.keySet()){
            System.out.println(key);
        }
        //根据Key排序 自定义算法 倒叙
        Map<Integer,String> treeMapComparator = new TreeMap<>((o1, o2) -> {
            return -o1.compareTo(o2);
        });
        treeMapComparator.put(1,"1");
        treeMapComparator.put(3,"3");
        treeMapComparator.put(2,"2");
        for (Integer key : treeMapComparator.keySet()){
            System.out.println(key);
        }
    }
}
