package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo5 {
    public static void main(String[] args) {
        /*短路逻辑运算符
          && ||
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int number1 = sc.nextInt();

        int number2 = number1 % 10;//个位
        System.out.println(number2);
        int number3 = number1 / 10 % 10;//十位
        System.out.println(number3);
        int number4 = number1 / 100 % 10;//百位
        System.out.println(number4);
        int number5 = number1 / 1000 % 10;//千位
        System.out.println(number5);

        boolean result = number2 == number5 && number3 == number4;
        System.out.println(result);
    }
}
