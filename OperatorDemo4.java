package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //& | !(与或非)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int a = sc.nextInt();

        boolean result = a > 1 & a < 10;
        System.out.println(result);
    }
}