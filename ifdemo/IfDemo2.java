package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        int hp = 200;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入受到的伤害：");
        int hurt = sc.nextInt();
        hp = hp - hurt;


        if (hp <= 0){
            hp = 1;
        }
        System.out.println(hp);

        System.out.println("请输入回复的血量：");
        int add = sc.nextInt();
        hp = hp + add;

        if (hp >= 200){
            hp = 200;
        }
        System.out.println(hp);
    }
}
