package 博客test;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.bark();// 狗叫
        cat.bark();// 猫叫
    }
}

abstract class Animal{
    /*
    * Animal是动物类,每个动物都有叫的方法。
    * 但由于Animal不是具体的动物,所以叫的方法无法具体实现
    * 那么我们该在方法中写什么好?
    * 写什么都是没用的,因为父类Animal的bark方法无法描述所有动物的叫!
    * 狗和猫的叫不同,狮子和大象等都不同
    * 那么既然无法实现,不如直接定义为抽象类!让子类重写抽象方法
    * 让子类自己去实现方法!
    * */
    public abstract void bark();
}


abstract class 水生 extends Animal{

}

class 狗 extends Animal{

    @Override
    public void bark() {

    }
}













class Dog extends Animal{

    @Override
    public void bark() {
        System.out.println("狗叫");
    }
}

class Cat extends Animal{

    @Override
    public void bark() {
        System.out.println("猫叫");
    }
}







abstract class son{
    String name;
    int age;

    public void eat(){
        System.out.println("宝吃奶");
    }
}








abstract class Person{// 抽象类
    abstract void eat();// 抽象方法,不用实现
}

class test{
    public static void main(String[] args) {
        Person per = new Person() {
            @Override
            void eat() {

            }
        };
    }
}


