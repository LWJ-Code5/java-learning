package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入订单价格：");
        double price = sc.nextDouble();

        double price1 = price * 0.9;
        System.out.println(price1);
        //细节：变量只在所属的大括号中生效
        double price2 = 0;
        if(price >= 30){
            //满30减10元
             price2 = price - 10;
        }else{
            price2 = price;
        }
        System.out.println(price2);

        if (price > price2){
            System.out.println("饿了么app最便宜");
        }else {
            System.out.println("美团app最便宜");
        }
    }
}
