package loopwhile;

public class WhileDemo1 {
    public static void main(String[] args) {
        /*利用while循环，实现游戏连续十次跳跃，用输出语句模拟
        格式：
             初始化语句
             while（条件判断语句）{
                    循环体
                    条件控制语句
             }
                     */

        int i = 0;
        while (i <= 10){
            System.out.println("跳跃");
            i++;
        }
    }
}
