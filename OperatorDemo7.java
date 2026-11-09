package com.itheima.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        //利用三元运算符，比较两个整数大小

        int a = 10;
        int b = 20;

        //第一种方法
        int max = a > b ? a : b;
        System.out.println(max);

        //第二种方法
        System.out.println(a > b ? a : b);
    }
}
