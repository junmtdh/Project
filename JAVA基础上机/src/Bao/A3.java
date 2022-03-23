package Bao;
class ChongZai{
    void print()
    {
        System.out.println("无参数");
    }
    void print(double a)
    {
        System.out.println(a);
    }
    void print(String b)
    {
        System.out.println(b);
    }
}
public class A3 {
    public static void main(String[] args){
        ChongZai p=new ChongZai();
        p.print();
        p.print(2.021);
        p.print("thanks");
    }
}
