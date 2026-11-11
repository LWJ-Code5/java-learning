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
/*
没有这个星期
星期二
星期三*/
