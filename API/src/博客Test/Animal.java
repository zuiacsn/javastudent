package 博客Test;

/*
public class Animal implements Cloneable{

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//方法在底层会帮我们创建一个对象,并把原对象中的数据拷贝过去。
    }
}
class Test3{
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Animal("珍兽宝",18);
        Animal clone = (Animal)animal.clone();
        System.out.println(clone.name+" "+clone.age);
    }
}
*/


class Animal implements Cloneable {
    public String name;
    public int age;
    public String[] hobbies;

    public Animal() {
    }

    public Animal(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Animal clone = (Animal) super.clone();
        clone.hobbies = hobbies.clone(); // 对hobbies属性进行浅拷贝
        return clone;
    }
}