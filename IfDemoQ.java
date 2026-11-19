package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemoQ {
    public static void main(String[] args) {
        /*牛牛开始学习数列，现在他想计算以下数列前n项的和，
          S（n）=1 - 2 + 3 - 4 + ···
          示例：
          输入：4
          说明：5（4） = 1 - 2 + 3 - 4 = -2
          输出：-2
        */

        //键盘录入一个整数，表示循环的范围
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = sc.nextInt();

        int sum = 0;
        //循环
        for (int i = 1;i <= n;i++){
            //判断当前的数字是奇数还是偶数
            if (i % 2 == 0){
                //偶数
                sum = sum - i;
            }else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
