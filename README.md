# java-learning

## 笔记

- 字符 char 只有2个字节，所以只能装一个字符，故单引号 '' 中只可以放一个，而字符串可以放多个，若是字符运算会查询ascll码表来运算
- 运算符中小括号优先级最高
## 代码示例
```java
char c = 'A';
System.out.println(c + 32);
int r = (1 + 2)*3;
```
## 笔记

**在if语句中，如果大括号里的内容只有一行，可以省略大括号**
## 代码示例
```java
if(body >= 180) System.out.println("太高了");
```
- if语句左括号一半写在第一行代码
- 小括号后面不能有分号
- 运算符&&不能用于int型，代码错误示例如下
```
if(x = 0 && y = 0);
```
- switch（），（）括号里面的表达式可以是字符，整数型byte short int，枚举，字符串
- case的值必须是真实数据，不能是变量
- switch没有break时，case会发生case穿透，case穿透会从目标代码开始运行到代码结尾
- 注意这种情况，代码如下
```
int num = 5;
        switch (num){
            case 1:
                System.out.println("星期一");
            default:
                System.out.println("没有这个星期");
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
        }
```
- 代码运行结果<br>
没有这个星期<br>
星期二<br>
星期三


# switch的新特性

## 第一个特性
- 箭头标签
```
int num = 5;
        switch (num) {
            case 1 -> System.out.println("星期一");
            default -> System.out.println("没有这个星期");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
        }
```
## 第二个特性
- case后面可以写多个值
```
case 1,4,5,6 -> System.out.println("星期一");
```
## 第三个特性
- switch可以有运行结果，要用到yield关键字，注意这个特性最后的大括号要有分号
```

        int num = 5;
           String name = switch (num) {
//               case 1, 4, 5, 6 -> {
//                   yield "一";
//               }
//               default -> {
//                   yield "没有这星期";
//               }
//               case 2 -> {
//                   yield "三";
//               }
//               case 3 -> {
//                   yield "四";
//               }
               //若代码只有一行，可以省略大括号和yield，上面的代码省略如下
               case 1, 4, 5, 6 -> "一";
               default -> "没有这星期";
               case 2 ->  "三";
               case 3 ->  "四";
           };
        System.out.println(name);
```
## 易错点
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double num = 0;
        for (int i = 1; i <= n; i++) {
            num += 1.0 / i;   // 关键：1.0 保证是浮点除法
        }
        System.out.println(num);
    }
}
```
**这里容易错的是for循环中num的和，如果有分数要用小数，带小数点，不然计算机会算成整数**


- 注意点
```
System.out.println("%.3f",num);   // 错误：println 不支持两个参数
System.out.printf("%.3f", num);   // 正确
```
**这种题，要注意有特殊情况，就要判断，n是1或2的时候**
```
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int F1 = 0;
        int F2 = 1;
        int F3 = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n ==1 || n ==2){   //这里是重点，处理特殊情况的
                F3 = 1;
            }else{
                F3 = F1 +F2;
                F1 = F2;
                F2 = F3;
            }
        }
        System.out.println(F3);
```
- 循环快速生成的方式：次数+.+for+i+回车(3.fori)
```
for (int i = 0; i < 3; i++) {
            
        }
```
