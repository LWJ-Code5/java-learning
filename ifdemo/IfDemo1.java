package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体温：");
        double tiwen = sc.nextDouble();

        if(tiwen >= 37.3){
            System.out.println("体温超过37.3");
        }
    }
}
