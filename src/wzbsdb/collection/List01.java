package wzbsdb.collection;

import java.util.*;

public class List01 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        arrayList.add(2);
        arrayList.add(23);
        arrayList.add(234);
        linkedList.add(3);
        //迭代器用于while循环
        Iterator<Integer> it = arrayList.iterator();
         while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Iterator<Integer> its = arrayList.iterator(); its.hasNext();){
            System.out.println(its.next());
        }
        //转换成数组
        Integer[] arrays = arrayList.toArray(new Integer[arrayList.size()]);
         for (Integer array : arrays ){
             System.out.println(array.toString());
         }
         //数组抓换成集合 (不可改变 不能使用add 之类地方法修改集合)
        List<Integer> oldList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(oldList);
         //数组抓换成集合 可以修改
        List<Integer> newList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        newList.add(8);
        System.out.println(newList);
        //打乱List
        Collections.shuffle(newList);
        System.out.println(newList);
    }
}
