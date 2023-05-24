package runtime;

import java.io.IOException;

/**
 * User: 86156
 * Date: 2023-04-18
 * Time: 9:16
 */

/*
* 表示当前系统的运行环境
*  public static  getRunTime() 获取当前系统的运行环境对象
*  public void exit(int status) 停止虚拟机
* */

public class RunTime1 {
    public static void main(String[] args) throws IOException {
        // 获取runtime对象
        Runtime r1 = Runtime.getRuntime();

        // 停止虚拟机
        // system.exit() 的底层源码
        // Runtime.getRuntime().exit(0);
        // System.out.println("看看我执行了吗?");


        // 运行cmd命令
        // shutdown : 关机
        // -s 一分钟之后关机
        // -t 指定时间
        // -a 取消关机操作
        // -r 关机并重启
        Runtime.getRuntime().exec("shutdown -s -t 3600");
        Runtime.getRuntime().exec("shutdown -a");

    }

}
