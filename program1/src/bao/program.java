package bao;

import static java.lang.Math.*;
import java.util.Random;
import java.awt.*;
import java.util.Scanner;

public class program {

    static Scanner input = new Scanner(System.in);

    public static void program1() {
        int r, r1;
        r = r1 = 2;//第一月和第二月的数量（个）
        for (int i = 1; i <= 12; i++) {
            r += r1;
            System.out.println(i + "月有：" + r1);
            r1 = r - r1;
        }
    }

    public static void program2() {
        int sum = 0;
        label:
        for (int i = 101; i < 200; i += 2) {
            for (int j = 2; j <= sqrt(i); j++) {
                if (i % j == 0)
                    continue label;//能被整除不是的，结束外层本次循环
            }
            sum++;
            System.out.print(i + "\40");
        }
        System.out.println("共计:" + sum + "个");
    }


    public static void program3() {
        for (int i = 100; i <= 999; i++) {
            if (i == pow(i % 10, 3) + pow(i / 10 % 10, 3) + pow(i / 100, 3))
                System.out.print(i + "\40");
        }
    }

    public static void program4() {
        System.out.print("请输入一个正整数：");
        int n = input.nextInt();
        System.out.print(n + "=");
        for (int k = 2; k <= n; k++) {
            while (k != n) {
                if (n % k == 0) {
                    System.out.print(k + "*");//能被整除输出k
                    n /= k;//n作为新的被除数
                } else
                    break;
            }
        }
        System.out.println(n);
    }

    public static void program5() {
        System.out.println("请输入你的成绩");
        float grade = input.nextFloat();
        System.out.println(grade >= 90 ? 'A' : grade >= 60 ? 'B' : 'C');
    }

    public static void program6() {
        System.out.println("请输入两个正整数：");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int i = 1;
        while ((m * i) % n != 0)//扩大法，扩大到的那个数最先成为另一个数的倍数，即为最小公倍数。
            i++;
        System.out.println("最小公倍数为：" + i * m);
        int r;
        while ((r = m % n) != 0) {//辗转相除法，余数不为零，
            m = n;//除数作为新的被除数
            n = r;//余数作为新的除数
        }
        System.out.println("最大公约数为：" + n);
    }

    public static void program7() {
        System.out.println("请输入一行字符串：");
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        char[] ch = new char[n.length()];
        ch = n.toCharArray();
        int z, k, s, q;
        z = k = s = q = 0;//计数
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z')
                z++;
            else if (ch[i] == '\40')
                k++;
            else if (ch[i] >= '0' && ch[i] <= '9')
                s++;
            else
                q++;
        }
        System.out.println("英文字母：" + z);
        System.out.println("空格：" + k);
        System.out.println("数字：" + s);
        System.out.println("其它字符：" + q);
    }

    public static void program8() {
        System.out.println("请输入一个数字：");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("请输入有几个数相加：");
        int b = input.nextInt();
        long s = 0, sum = 0;
        for (int i = 1; i <= b; i++) {//几个数相加循环几次
            s = s * 10 + a;
            sum += s;
            if (i == 1) System.out.print(s);
            else System.out.print("+" + s);//输出+和加数
        }
        System.out.println("=" + sum);
    }


    public static void program9() {
        System.out.println("1000以内的完数为：");
        for (int i = 2; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    sum += j;//他的因子之和
            }
            if (sum == i)
                System.out.print(sum + "\40");
        }
        System.out.println();
    }

    public static void program10() {
        double meter = 100;
        double sum = 100;
        for (int i = 1; i <= 10; i++) {
            meter = meter / 2;//反弹的
            sum += meter * 2;//开始的高度加反弹的和反弹高度落下的
            if (i == 10)
                System.out.println("第10次反弹：" + meter + "米。");
        }
        System.out.println("一共经历：" + sum + "米。");
    }

    public static void program11() {//穷举
        int sum = 0;
        for (int i = 1; i <= 4; i++)
            for (int j = 1; j <= 4; j++)
                for (int k = 1; k <= 4; k++)
                    if (i != j && i != k && j != k) {
                        sum++;
                        System.out.printf("%d%d%d ", i, j, k);
                    }
        System.out.println("\n能组成：" + sum + " 个无重复数字的3位数。");
    }

    public static void program12() {
        System.out.print("请输入当月的利润：");
        Scanner input = new Scanner(System.in);
        float lirun = input.nextFloat();
        float j = 1;//奖金
        if (lirun <= 100000)
            j = lirun * 0.1f;
        else if (lirun > 100000 && lirun <= 200000)
            j = 10000 + (lirun - 100000) * 0.075f;
        else if (lirun > 200000 && lirun <= 400000)
            j = 100000 * 0.1f + 100000 * 0.075f + (lirun - 200000) * 0.05f;
        else if (lirun > 400000 && lirun <= 600000)
            j = 27500 + (lirun - 400000) * 0.03f;
        else if (lirun > 600000 && lirun <= 1000000)
            j = 39500 + (lirun - 600000) * 0.015f;
        else
            j = 48500 + (lirun - 1000000) * 0.01f;
        System.out.println("应发放奖金总数为:" + j);
    }

    public static void program13() {
        System.out.println("该数为：");
        int x, y;
        for (int i = 1; i < 10000; i++) {
            x = (int) sqrt(i + 100);
            y = (int) sqrt(i + 268);//这个数开方
            if (x * x == i + 100 && y * y == i + 268)
                System.out.println(i);
        }
    }

    public static void program14() {

        Scanner input = new Scanner(System.in);
        int year, month, day;
        System.out.println("请输入年份：");
        year = input.nextInt();
        while (year <= 0) {
            System.out.println("输入有误，请重新输入年份！");
            year = input.nextInt();
        }
        System.out.println("请输入月份：");
        month = input.nextInt();
        while (month < 1 || month > 12) {
            System.out.println("输入有误，请重新输入月份！");
            month = input.nextInt();
        }
        int sum = 0;
        switch (month) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 31;
                break;
            case 3:
                sum = 59;
                break;
            case 4:
                sum = 90;
                break;
            case 5:
                sum = 120;
                break;
            case 6:
                sum = 151;
                break;
            case 7:
                sum = 181;
                break;
            case 8:
                sum = 212;
                break;
            case 9:
                sum = 243;
                break;
            case 10:
                sum = 273;
                break;
            case 11:
                sum = 304;
                break;
            case 12:
                sum = 334;
                break;
        }
        System.out.println("请输入号数：");
        day = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) {//闰年
            if (month == 2) {
                while (day < 1 || day > 30) {
                    System.out.println("输入有误！\n提示：闰年2月仅有29天,也不能为负，请重新输入！");
                    day = input.nextInt();
                }
            }//+优先级很高
            System.out.println("这一天是这一年的第：" + ((day <= 31 && month <= 2) ? (sum + day) : (sum + day + 1)) + "天！");
        } else {//平年
            if (month == 2) {
                while (day < 1 || day > 28) {
                    System.out.println("输入有误!\n平年2月仅有28天，也不能为负，请重新输入！");
                    day = input.nextInt();
                }
            }
            System.out.println("这一天是这一年的第：" + (sum + day) + "天！");
        }
    }

    public static void program15() {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        System.out.println("请输入三个整数！");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x > y) {
            x += y;
            y = x - y;
            x -= y;
        }
        if (x > z) {
            x += z;
            z = x - z;
            x -= z;
        }
        if (y > z) {
            y += z;
            z = y - z;
            y -= z;
        }
        System.out.println("从小到大为：" + x + ' ' + y + ' ' + z);
    }

    public static void program16() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "*" + i + "=" + i * j + '\t');
            System.out.println();
        }
    }

    public static void program17() {
        int peach = 1;
        for (int i = 9; i >= 1; i--) {
            peach = (peach + 1) * 2;//第一次为第九天的数量
        }
        System.out.println(peach);
    }

    public static void program18() {
        for (char a = 'x'; a <= 'z'; a++)
            for (char b = 'x'; b <= 'z'; b++)
                for (char c = 'x'; c <= 'z'; c++) {
                    if (a != 'x' && c != 'x' && c != 'z' && a != b && a != c && b != c) {
                        System.out.println("a VS " + a);
                        System.out.println("b VS " + b);
                        System.out.println("c VS " + c);
                    }
                }
    }

    public static void program19() {
        for(int x=-3;x<=3;x++) {
            for(int y=0;y<abs(x);y++)
                System.out.print("\40");
            for (int z=0;z<=6-2*abs(x);z++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    public static void program20(){
        float[] a=new float[22];
        float sum=0;a[0]=a[1]=1;
        for(int i=1;i<=20;i++){
            a[i+1]=a[i]+a[i-1];
            sum+=a[i+1]/a[i];
        }
        System.out.println(sum);
    }

    public static void program21(){
        long q,sum=0;
        for(int i=1;i<=20;i++){
            q=1;
            for(int j=21-i;j>=1; q*=j--);
         sum+=q;
        }
        System.out.println(sum);
    }

    public static int DiGui1(int n){
        if(n==1)
            return 1;
        return n*DiGui1(n-1);
    }
    public static void program22(){
        System.out.println(DiGui1(5));
    }

    public static int DiGui2(int n){
        if(n==1) return 10;
        return 2+DiGui2(n-1);
    }
    public static void program23(){
        System.out.println(DiGui2(5));
    }

    public static void program24(){
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个不多于5位的正整数：");
        int n=input.nextInt();
        int sum=0;
        System.out.println("这个数逆序输出为：");
        do{
            System.out.print(n%10);
            sum++;
            n/=10;
        }while(n!=0);
        System.out.println("\n这是一个"+sum+"位数");
    }

    public static void program25(){
        System.out.println("请输入一个正整数：");
        long n=input.nextLong();
        long sum=0L,m=n;
        while(n>0){
            sum=sum*10+n%10;
            n/=10;
        }
        if(sum==m)
            System.out.println("这个数是回文数！");
        else
            System.out.println("这个数不是回文数！");
    }

    public static void program26(){
        System.out.println("请输入星期的第一个大写字母：");
        char c=input.next().charAt(0);
        switch(c){
            case 'M':System.out.println("Monday");break;
            case 'T':
                System.out.println("请输入星期的第二个字母");
                char c1=input.next().charAt(0);
                if(c1=='u')
                System.out.println("Tuesday");
                else if(c1=='h')
                    System.out.println("Thursday");
                else System.out.println("输入错误");
                break;
            case 'W':
                System.out.println("Wednesday");break;
            case 'F':
                System.out.println("Friday");break;
            case 'S':
                System.out.println("请输入星期的第二个字母");
                char c2=input.next().charAt(0);
                if(c2=='a')
                    System.out.println("Saturday");
                else if(c2=='u')
                    System.out.println("Sunday");
                else System.out.println("输入错误");
                break;
            default:System.out.println("输入错误!!!");
        }
    }

    public static void program27(){
        Label: for(int i=2;i<100;i++){
            for(int j=2;j<=sqrt(i);j++){
                if(i%j==0)
                    continue Label;
            }
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void program28(){
        float[] n=new float[10];
        System.out.println("请输入10个数：");
        for(int i=0;i<n.length;i++)
            n[i]=input.nextInt();
        for(int i=0;i<n.length-1;i++){//9次
            for(int j=0;j<n.length-i-1;j++)
                if(n[j+1]>n[j]){
                    n[j+1]+=n[j];
                    n[j]=n[j+1]-n[j];
                    n[j+1]-=n[j];
                }
        }
        System.out.println("从大到小为：");
        for (float x :n) {
            System.out.print(x+"\40");
        }
        System.out.println();
    }

    public static void program29() {
        int[][] a = new int[3][3];
        int i = 0, j = 0,sum=0;
        Random r = new Random();
        System.out.println("随机生成一个3*3矩阵：");
        while (i++ < 3){
            j=0;
            while (j++ < 3) {
                a[i-1][j-1] = r.nextInt(100);
                    System.out.print(a[i-1][j-1]+"\t");
                    if(i-1==j-1||(i-1)+(j-1)==2)
                        sum+=a[i-1][j-1];
                    if(j==3) System.out.println();
            }
        }
        System.out.println("对角线之和为："+sum);
    }

    public static void program30(){
        int[] array={18,29,31,401,555};
        int[] array1=new int[6];
        System.out.println("原数组为：");
        for(int a:array)
        System.out.print(a+"\t");
        System.out.println("\n请输入要插入的整数：");
        int number=input.nextInt();
        array1[0]=number;
        for(int i=0;i<array1.length-1;i++){
            array1[i+1]=array[i];
            if(array1[i]>array1[i+1]){
                array1[i]+=array1[i+1];
                array1[i+1]=array1[i]-array1[i+1];
                array1[i]-=array1[i+1];
            }
        }
        for(int a:array1)
            System.out.print(a+"\t");
        System.out.println();
    }

    public static void program31(){
        int[] m=new int[10];
        Random r=new Random();
        System.out.println("随机生成的数为：");
        for(int i=0;i<m.length;i++) {
            m[i] = r.nextInt(1000);
            System.out.print(m[i]+"\t");
        }
        System.out.println("\n逆序输出为：");
            for(int j=m.length-1;j>=0;j--)
                System.out.print(m[j]+"\t");
        System.out.println();
    }

    public static void program32(){
        System.out.println("请输入一个>=七位数的整数！");
        long m=input.nextLong();
        long number;
        if(m<1000000) {
            System.out.println("输入错误！！！");
            return;
        }
        for(int i=1;i<=3;i++)
            m /= 10;
        number=m%10000;
        while(number!=0) {
            System.out.print(number % 10);
            number/=10;
        }
        System.out.println();
    }
}
