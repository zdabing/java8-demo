package wzbsdb.instance;

import wzbsdb.javabean.Person;

public class Student extends Person {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
