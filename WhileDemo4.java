package loopwhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileDemo4 {
    public static void main(String[] args) {
        /*给定一个整数，请计算所有数位之和，若n为负数，请先取其绝对值
        示例：12
        结果为：1 + 2 = 3
        -395
        结果：3 + 9 + 5 = 17
         */

        Scanner SC = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = SC.nextInt();

        int sum = 0;
        if (number < 0){
            number = -number;
        }
            while (number != 0){
                sum = sum + number % 10;
                number = number / 10;
            }
        System.out.println(sum);
    }
}
