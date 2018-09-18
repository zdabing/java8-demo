package javabean;

public class Person {
    private String name;
    private int age;
    private boolean child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isChild() {
        return age < 6;
    }

    public void setChild(boolean child) {
        this.child = child;
    }
}
