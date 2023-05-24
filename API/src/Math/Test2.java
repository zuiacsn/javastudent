package Math;

import java.util.Scanner;

/**
 * User: 86156
 * Date: 2023-04-14
 * Time: 13:56
 */
// 自幂数 一个n位自然数等于自身各个位数上的n次幂之和
public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            boolean flag = method(i);
            if(!flag){
                System.out.println(i+"不是自幂数");
            }else{
                System.out.println(i+"是自幂数");
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean method(int num) {
        int temp = num;
        int sum = 0;
        int count = 0;

        while(num!=0){
            num/=10;
            count++;
        }
        num = temp;
        while (temp!=0) {
            sum+=Math.pow(temp%10,count);
            temp/=10;
        }

        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
}
