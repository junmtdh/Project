package Bao1;

class A {
    public String m;
    public void method() {
        System.out.println("这是A的一个方法");
    }
}
class B extends A{
    //新增成员变量
    String n;
    //重写父类A中的方法
    public void method(){
        System.out.println("重写父类的一个方法");
    }
    //新增一个方法
    public void method1()
    {
        System.out.println("这是B新增加的方法");
    }
}
public class E {
    public static void main(String[] args){
        //创建B的对象并赋值给A的对象a
        B b = new B();
        //判断b是不是A的实例，如果是向上转型
        if(b instanceof A){
            A a=(A) b;
            a.m="主类A";
            System.out.println(a.m);
            //输出子类重写方法
            a.method();
        }
    }
}
