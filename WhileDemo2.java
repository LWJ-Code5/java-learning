package loopwhile;

public class WhileDemo2 {
    public static void main(String[] args) {
        //假设在银行投资100000元，银行复利是1.7%，问多少年能实现本金翻倍
        double money = 100000;
        double expectMoney = 200000;
        int year = 0;
        while (money < expectMoney){
            money = money + money * 0.017;
            year++;
        }
        System.out.println(year);
    }
}
