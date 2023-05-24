package 博客Test;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
/*        //Student stu = new Student();
        stu.name = "兽宝一号";
        stu.age = 18;// 永远十八!!
        System.out.println(stu.toString());*/
    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+age;
    }
}

class test{
    public static void main(String[] args) {
        Student s1 = new Student("兽宝一号",18);
        Student s2 = new Student("兽宝二号",18);

        Student s3 = new Student("兽宝三号",18);
        Student s4 = null;

        System.out.println(Objects.isNull(s3));//false
        System.out.println(Objects.isNull(s4));//true

        System.out.println(Objects.nonNull(s3));//true
        System.out.println(Objects.nonNull(s4));//false
    }
}
