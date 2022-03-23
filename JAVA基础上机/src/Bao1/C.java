package Bao1;

class A1{
    void f(){
        for(char i='a';i<='z';i++){
            System.out.print(i+"\40");
        }
    }
}
class B1 extends A1 {
    //新增一个方法g输出英文大写字母表
    void g() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + "\40");
        }
    }
}
public class C {
    public static void main(String[] args){
        B1 b=new B1();
        //子类b调父类的f方法
        b.f();
        System.out.println();
        //调新增的方法
        b.g();
        System.out.println();
    }
}
