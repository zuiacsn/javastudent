import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan",13);
        Person p2 = new Person("zhangsan",13);

        // equals 底层比较的是地址值,要想比较内容,重写equals方法
        System.out.println(p1.equals(p2));// false
        System.out.println(p1==p2);// false

        // 重写之后
        System.out.println(p1.equals(p2));// true
        System.out.println(p1==p2);// false 比较的是纯地址值
    }
}


