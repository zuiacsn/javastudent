package 博客Test;
import java.util.Arrays;
/*public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Animal animal = new Animal("珍兽宝",18);
        Animal clone = (Animal)animal.clone();

        System.out.println(clone.equals(animal));// false 两个不同的对象
        System.out.println(clone.name.equals(animal.name));// true 引用同一个对象

        clone.age = 17;
        System.out.println(animal.age);// 18 age是基本数据类型,直接拷贝属性值

        clone.name = "zhangsan";
        System.out.println(animal.name);//珍兽宝
    }
}*/







class test6{
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Animal();
        animal.hobbies = new String[]{"swimming", "running"};
        //使用clone方法对Animal对象进行浅拷贝，得到一个新的Animal对象：
        Animal clone = (Animal) animal.clone();


        //修改clone对象的hobbies属性中的第一个元素
        clone.hobbies[0] = "reading";

        //输出原对象和拷贝后的对象的hobbies属性
        System.out.println(Arrays.toString(animal.hobbies));
        System.out.println(Arrays.toString(clone.hobbies));
    }
}




class Test5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] hobbies = {"打篮球", "听音乐"};
        Animal animal = new Animal("小猫", 2, hobbies);
        Animal clone = (Animal) animal.clone();

        System.out.println(clone.hobbies[0]); // 打篮球
        System.out.println(clone.hobbies[1]); // 听音乐
        System.out.println(clone.hobbies == animal.hobbies); // true，同一个String[]对象

        clone.hobbies[0] = "看电影";
        System.out.println(animal.hobbies[0]); // 看电影
        System.out.println(clone.hobbies[0]); // 看电影
    }
}
