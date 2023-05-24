package 博客Test;

import java.security.SecurityPermission;

public class TestDemo2{
    public static void main(String[] args) {
        // public static void System.arraycopy(数据源,数据源索引,目标,目标开始索引,拷贝个数);
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,5,arr2,0,5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");// 6 7 8 9 10 0 0 0 0 0
        }
    }













    public static void main1(String[] args) {

        long begin = System.currentTimeMillis();
        int i = 0;
        while(i<100000000){
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(begin);
        System.out.println(end);
        System.out.println(end-begin);

    }
}
