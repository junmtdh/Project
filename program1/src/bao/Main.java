package bao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int option=1;
       Label:while (option != 0) {
        while(true) {
            System.out.println("请输入程序号，例如输入1，就会运行第一个程序！输入0结束程序");
            try {
                Scanner input=new Scanner(System.in);
                option = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("输入类型不匹配,请重新输入！");
                continue;
            }
        }
        switch (option) {
            case 1:
                System.out.println("题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，" +
                        "小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ ");
                       program.program1();break;
             case 2:
                System.out.println("题目：判断101-200之间有多少个素数，并输出所有素数。");
                       program.program2();break;
            case 3:
                System.out.println("题目：打印出所有的 \"水仙花数 \"");
                program.program3();break;
            case 4:
                System.out.println("题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。");
                program.program4();break;
            case 5:
                System.out.println("利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，" +
                        "60-89分之间的用B表示，60分以下的用C表示。");
                program.program5();break;
            case 6:
                System.out.println("题目：输入两个正整数m和n，求其最大公约数和最小公倍数。");
                program.program6();break;
            case 7:
                System.out.println("题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。");
                program.program7();break;
            case 8:
                System.out.println("题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。" +
                        "例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。");
                program.program8();break;
            case 9:
                System.out.println(" 找出1000以内的所有完数。");
                program.program9();break;
            case 10:
                System.out.println("题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，" +
                        "求它在 第10次落地时，共经过多少米？第10次反弹多高？ ");
                program.program10();break;
            case 11:
                System.out.println("题目：有1、2、3、4四个数字，" +
                        "能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输入。");
                program.program11();break;
            case 12:
                System.out.println("题目：企业发放的奖金根据利润提成。");
                program.program12();break;
            case 13:
                System.out.println("题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？");
                program.program13();break;
            case 14:
                System.out.println("题目：输入某年某月某日，判断这一天是这一年的第几天？");
                program.program14();break;
            case 15:
                System.out.println("题目：输入三个整数x,y,z，请把这三个数由小到大输出。");
                program.program15();break;
            case 16:
                System.out.println("题目：输出9*9口诀。");
                program.program16();break;
            case 17:
                System.out.println("题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个" +
                        "第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。" +
                        "到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 ");
                program.program17();break;
            case 18:
                System.out.println("题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。" +
                        "已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。");
                program.program18();break;
            case 19:
                System.out.println("打印出实心菱形1,3,5,7,5,3,1");
                program.program19();break;
            case 20:
                System.out.println("题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。");
                program.program20();break;
            case 21:
                System.out.println("题目：求1+2!+3!+...+20!的和");
                program.program21();break;
            case 22:
                System.out.println("题目：利用递归方法求5!。");
                program.program22();break;
            case 23:
                System.out.println("题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。" +
                        "问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？");
                program.program23();break;
            case 24:
                System.out.println("题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。");
                program.program24();break;
            case 25:
                System.out.println("题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。");
                program.program25();break;
            case 26:
                System.out.println("题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。");
                program.program26();break;
            case 27:
                System.out.println("题目：求100之内的素数 ");
                program.program27();break;
            case 28:
                System.out.println("题目：对10个数进行排序");
                program.program28();break;
            case 29:
                System.out.println("题目：求一个3*3矩阵对角线元素之和");
                program.program29();break;
            case 30:
                System.out.println("题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。");
                program.program30();break;
            case 31:
                System.out.println("题目：将一个数组逆序输出。");
                program.program31();break;
            case 32:
                System.out.println("题目：取一个整数a从右端开始的4～7位。");
                program.program32();break;
                   default:
                       if(option==0)
                       System.out.println("程序结束，欢迎下次使用！");
                       else {
                           System.err.println("后续程序未完善，请重新输入程序号！");
                           continue Label;
                       }
               }
          }
          program.input.close();
       }
    }
