package 博客test.接口;

import java.util.jar.Manifest;

public class Test {
}

abstract class Animal{
    String name;
    int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    public Dog(String name,int age) {
        super(name,age);
    }
}
