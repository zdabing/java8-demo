package wzbsdb.instance;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ClassDemo {
    public static void getClassDemo(){
        // 三种获取实例
        Class<String> cl1 = String.class;
        String s = "hello";
        Class cl2 = s.getClass();
        Class cl3 = null;
        try {
            cl3 = Class.forName("java.lang.String");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(cl3 == cl1);
        System.out.println(cl2 == cl1);
    }
    public static void main(String[] args) throws Exception{
        getClassDemo();
        Student student = new Student("万飞",19);
        Field field = student.getClass().getField("name");
        Field[] fields = student.getClass().getFields();
        Arrays.stream(fields).forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println(field.getType());
        System.out.println(field.getName());
        System.out.println(field.get(student));
        System.out.println(field);
        System.out.println("------------------------------");
        Class<String> clazz = String.class;
        String s1 = clazz.newInstance();
        System.out.println(s1);
        Constructor<String> constructor = clazz.getConstructor(String.class);
        String s2 = constructor.newInstance("hello");
        System.out.println(s2);
    }
}
