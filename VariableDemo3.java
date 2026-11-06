package com.itheima.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        /*1.变量用之前一定要赋值
          2.一条语句可以定义多个变量，也可以连续赋值
          3.变量名不允许重复定义
         */

        int a,b,c,d;
//        a = 1;
//        b = 2;
//        c = 3;
//        d = 4;

        a = b = c = d = 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
