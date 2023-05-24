package 博客Demo;

public class StringMethod {
    public static void main(String[] args) {
        String str = "zui ai chi shou nai";
        // 截取部分内容
        String substring = str.substring(4,9);
        System.out.println(substring);

    }


    public static void main4(String[] args) {
        String s = String.format("%d-%d-%d", 2019, 9,14);
        System.out.println(s);

    }

    public static void main2(String[] args) {
        // 数字转字符串
        String s1 = String.valueOf(1234);
        String s2 = String.valueOf(12.34);
        String s3 = String.valueOf(true);
        int data1 = Integer.parseInt("1234");
        double data2 = Double.parseDouble("12.34");
    }


    public static void main3(String[] args) {
        String s = "hello";

        // 字符串转数组
        char[] ch = s.toCharArray();

        // 数组转字符串
        String s2 = new String(ch);
    }


    public static void main1(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO";

        System.out.println(s1.toUpperCase());// 小写转大写
        System.out.println(s2.toLowerCase());// 大写转小写
    }

}

