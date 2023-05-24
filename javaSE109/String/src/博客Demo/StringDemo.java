package 博客Demo;

public class StringDemo {
    public static void main(String[] args) {

        String str1 = "兽宝一号";

        String str2 = new String("兽宝一号");

        System.out.println(str1.equals(str2));// true
    }
}







class compare{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == b);
    }
}
