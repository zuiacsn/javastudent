package Regex.博客;


import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要校验的QQ号码:>");
        String QQ = sc.nextLine();
        boolean flag = checkQQ(QQ);
        System.out.println(flag);
    }
    public static boolean checkQQ(String QQ){
        int length = QQ.length();

        // 检验长度 6~20
        if(length<6 || length > 20){
            return false;
        }

        // 检验开头是否为零
        if(QQ.startsWith("0")){
            return false;
        }

        // 检验是否都为数字
        for (int i = 0; i < length; i++) {
            char c = QQ.charAt(i);
            if (c < '0' | c > '9') {
                return false;
            }
        }

        return true;
    }
}
