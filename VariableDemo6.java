package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
        /*键盘录入
        第一步：找到Scanner这个打工人
        第二步：让Scanner干活
         */

        //第一步
        Scanner sc = new Scanner(System.in);

        //接收键盘录入的整数
        int num = sc.nextInt();
        //接收小数
        double num2 =sc.nextDouble();
        //接收字符串
        String str = sc.next();
        System.out.println(str);
    }
}
