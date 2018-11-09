package wzbsdb.annotation;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Annotation01 {
    public static void main(String[] args) {
        Person person = new Person("dabing",30);
        Person person1 = new Person(null,18);
        checkPerson(person);
        checkPerson(person1);
    }
    static void checkPerson(Person person){
        System.out.println(person.getName() + "检查开始-------------------------");
        Class cl1 = Person.class;
        Arrays.stream(cl1.getDeclaredFields()).forEach(e -> {
            try {
                //强制设为可以访问
                e.setAccessible(true);
                checkFiled(e,person);
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        });
    }
    static void checkFiled(Field field,Person person) throws IllegalAccessException {
        if (field.isAnnotationPresent(NotNull.class)){
            Object object = field.get(person);
            if (object == null){
                System.out.println("不能为空哇");
            }
        }
        if (field.isAnnotationPresent(Range.class)){
            Range range = field.getAnnotation(Range.class);
            int n = (Integer) field.get(person);
            if (n < range.min() || n > range.max()){
                System.out.println("数据超出范围了歪");
            }
        }
    }
}
