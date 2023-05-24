package system;

/**
 * User: 86156
 * Date: 2023-04-14
 * Time: 14:21
 */

/*
* System也是一个工具类,提供了一些与系统相关的的方法
* 掌握三个方法即可
* 1.public static void exit(int status) 终止当前运行的java虚拟机
* 2.public static long currentTimeMillis() 返回当前系统时间毫秒值形式
* 3.public static void System.arraycopy(数据源,数据源开始索引,目标,目标开始索引,拷贝个数);
* */

public class SystemDemo1 {
    public static void main(String[] args) {
        //public static void exit(int status) 终止当前运行的java虚拟机


        // public static long currentTimeMillis() 返回当前系统时间毫秒值形式
        long l = System.currentTimeMillis();
        System.out.println(l);

        // 拷贝数组
        // public static void System.arraycopy(数据源,数据源索引,目标,目标开始索引,拷贝个数);
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,5,arr2,0,5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}
