package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //寻找7的有缘数：定义一个两位整数，只要该数字包含7或者是7的倍数

        int number = 71;

        int ge = number % 10;
        int shi = number /10 % 10;

        System.out.println(ge == 7 || shi == 7 || number % 7 == 0);
    }
}
