package com.itheima.variable;

import javax.swing.text.StyledEditorKit;

public class VariableDemo4 {
    public static void main(String[] args) {
        //基本数据类型
        /*整数：byte，short，int，long
          浮点数：float，double
          字符数：char
          布尔数：boolea
          整数，小数取值范围大小关系：
          double>float>long>int>short>byte
         */

        byte a = 127;
        System.out.println(a);

        //细节：long类型数据必须以L结尾，可以是大写也可以是小写。建议大写，方便阅读
        long l = 1000000000000L;
        System.out.println(l);

        //细节：浮点型的变量，必须以f或F结尾,一般大写
        float f = 1.1F;
        System.out.println(f);

        //double是浮点型中的默认类型，所以不加f也行
        double C = 1.1;
        System.out.println(C);

        boolean bb = false;
        System.out.println(bb);
    }
}
