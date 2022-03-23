package Jiekou;

//创建InterfaceA接口
interface InterfaceA1 {
    int method(int n);
}
// 创建ClassA类来实现接口InterfaceA
class ClassA implements InterfaceA1{
    //求1到n的和
    public int method(int n) {
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum += i;
        }
        return sum;
    }
}
//创建ClassB来实现接口InterfaceA
class ClassB implements InterfaceA1 {
    //重写方法求n阶乘
    public int method(int n) {
        int sum=1;
        for (int i = 1; i <=n; i++)
        {
            sum*=i;
        }
        return sum;
    }
}
//创建测试类E
public class E2 {
    public static void main(String[] args) {
        //创建匿名对象打印1-n的和与阶乘
        System.out.println("1-n的和为：" + new ClassA().method(10));
        System.out.println("1——n的阶乘为：" + new ClassB().method(5));
    }
}
