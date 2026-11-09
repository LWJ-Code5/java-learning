package com.itheima.ifdemo;

public class IfDemo3 {
    public static void main(String[] args) {
        //第一一个小数表示成绩
        double score = 200;

        if(score >= 0 && score <= 100){
            if(score >= 60){
                System.out.println("通过");
            }else {
                System.out.println("不通过");
            }
        }else{
            System.out.println("不合理");
        }
    }
}
