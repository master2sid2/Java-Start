package java_start.lesson5.Test;

/**
 * Created by Master on 8.1.2015.
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);

    }

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
        checkAge(age);
        this.age = age;
    }

    private void checkAge(int age) {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException();
        }
    }

    public String sayHello() {
        return ("Hello, i'm " + name + ", " + age + " years old");
    }
}

