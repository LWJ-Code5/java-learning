package com.itheima.variable;

public class Variable {
    public static void main(String[] args) {
        /*微信余额：0
        支付宝：10
        银行卡：20
        问题一：现在一共多少钱
        问题二：微信收了10元，又发了2元红包，余额多少
         */

        //定义一个变量记录微信余额
        double a = 0;

        //定义一个变量记录支付宝余额
        double b = 10;

        //定义一个变量记录银行卡余额
        double c = 20;
        //一共的钱
        System.out.println(a + b + c);

        a = a + 10;
        a = a - 2;
        System.out.println(a);
    }
}
