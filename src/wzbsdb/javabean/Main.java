package wzbsdb.javabean;

import java.beans.*;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()){
            printPropertyDescriptor(propertyDescriptor);
        }
    }
    static void printPropertyDescriptor(PropertyDescriptor pd){
        String name = pd.getName();
        Class<?> clazz = pd.getPropertyType();
        if (name.equals("class") || clazz == null){
            return;
        }
        Method readMethod = pd.getReadMethod();
        Method writeMethod = pd.getWriteMethod();
        System.out.println(name);
        System.out.println(clazz.getName());
        System.out.println(readMethod);
        System.out.println(writeMethod);
    }
}
