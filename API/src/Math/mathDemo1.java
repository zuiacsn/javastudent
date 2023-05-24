package Math;

import java.util.Scanner;

/**
 * User: 86156
 * Date: 2023-04-14
 * Time: 13:23
 */


/*
* 前提条件:
* 不用死记硬背,需要记住各种API的作用即可
* ,用到的时候直接去文档去查
* */

/*
* Math 帮助我们进行数学计算的工具类
* 里面的方法都是静态的,直接用类名进行调用即可
* */

public class mathDemo1 {
    public static void main(String[] args) {
        // 获取一个数的绝对值 abs()
        System.out.println(Math.abs(-4));

        // 向上取整 ceil()
        System.out.println(Math.ceil(3.14));

        // 向下取整 floor()
        System.out.println(Math.floor(3.14));

        // 四舍五入 round
        System.out.println(Math.round(4.51));

        // 获取两个int中的较大值 max
        System.out.println(Math.max(3,5));
        System.out.println(Math.min(3,5));

        // 获取a的b次方 pow
        System.out.println(Math.pow(2,5));

        // 获取a的立方根 c brt(double a)
        System.out.println(Math.cbrt(3));

        // 返回值为double的随机值,范围为[0.0,1.0) random
        System.out.println(Math.random());


    }
}
