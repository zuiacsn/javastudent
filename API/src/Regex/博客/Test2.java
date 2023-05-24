package Regex.博客;

import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要校验的QQ号码:>");
        String QQ = sc.nextLine();
        boolean flag = QQ.matches("[1-9]\\d{5,19}");
        System.out.println(flag);
    }
}
