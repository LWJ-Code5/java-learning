package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo8 {
    public static void main(String[] args) {
        /*需求：键盘录入两个数字，表示一个范围
          统计这个范围中既能被3整除
          又能被5整除的数字有多少个
         */

        //累加思想：数字 ---> sum
        //统计思想： count ---> 满足条件 ++

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();

        //求两个数字最大值和最小值
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        int count = 0;
        for (int i = min ; i <= max ; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        if (count == 0){
            System.out.println("在"  + min + "~" + max + "之间没有满足要求的数字");
        }else {
            System.out.println("在"  + min + "~" + max + "之间,满足要求的数字有" + count + "个");
        }

    }
}
