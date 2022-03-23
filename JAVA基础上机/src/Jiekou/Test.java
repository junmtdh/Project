package Jiekou;

interface Compute {//定义一个接口Compute
    int computer(int n,int m);
}
//定义四个类分别实现此接口，完成+-*/运算
class Add implements Compute{
    //定义Add类分别实现接口，完成+运算
    public int computer(int n, int m) {
        return n+m;
    }
}
//定义Subtract类分别实现接口，完成-运算
class Subtract implements Compute{
    public int computer(int n, int m) {
        return n - m;
    }
}
//定义Multiply类分别实现接口，完成*运算
class Multiply implements Compute{
    public int computer(int n, int m) {
        return n * m;
    }
}
//定义Divide类分别实现接口，完成/运算
class Divide implements Compute{
    public int computer(int n, int m) {
        return n/m;
    }
}
//创建UseCompute类，通过调用useCom（）有参方法实现计算显示并返回
class UseCompute {
    public void useCom(Compute com,int one,int two){
        System.out.println(com.computer(one, two));
    }
}
//创建Test 类，调用UseCompute中的方法useCom来完成+-*/运算
public class Test {
    public static void main(String[] args) {
        //创建匿名对象，通过参数调用相应的方法
        System.out.println(new Add().computer(10, 5));
        System.out.println(new Subtract().computer(10, 5));
        System.out.println(new Multiply().computer(10, 5));
        System.out.println(new Divide().computer(10, 5));
    }
}

