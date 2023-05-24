package Math;

import java.util.Scanner;

/**
 * User: 86156
 * Date: 2023-04-14
 * Time: 13:52
 */

//判断是否为质数
public class Test {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("请输入要进行判断的数字:");
        int num = sc.nextInt();*/

        long start = System.currentTimeMillis();
        System.out.println(start);
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            boolean flag = isPrime(i);
            if(!flag){
                //System.out.println(i+"不是质数");
            }else{
                //System.out.println(i+"是质数");
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start);
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

}
