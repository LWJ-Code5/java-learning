package com.itheima.ifdemo;

public class IfDemo9 {
    public static void main(String[] args) {
        //有一组特殊的数字，从第三组开始，每一项都是前两项的和，请问第十项的数字是多少
        //0,1,1,2,3,5,8,13,21,34,55,89
        //定义两个变量，去记录前两项的值
        int a = 0;
        int b = 1;

        //定义一个变量，赋值为0，表示a和b后面那一项的值
        int c = 0;

        //利用循环不断获取这些特殊数字每一项的值
        //开始条件：3
        //结束条件：10
        //循环体：（1）求的值（2）不断的修改a和b记录的值
        for (int i = 3; i <= 10; i++) {
            //求c的值
            c = a + b;

            //不断的修改a和b记录的值
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
