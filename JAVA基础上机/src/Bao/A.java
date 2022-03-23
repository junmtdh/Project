package Bao;
public class A {
    public static void main(String[] args){
    Lader p=new Lader(5,10,20);

    System.out.println("面积为：");
    System.out.println(p.getArea());

    Circle p1=new Circle(6);
    System.out.println("周长为：");
    System.out.println(p1.perimeter());

    System.out.println("面积为：");
    System.out.println(p1.area());
    }
}
class Lader{
    private double up,down,height;  //上底、下底、高
    public double area; //面积
    //定义构造器
    public  Lader(double up,double down,double height){
        this.up=up;
        this.down=down;
        this.height=height;
    }
    double getArea(){    //获取面积
        return (up+down)*height/2.0;
    }
}
class Circle{
    private static final double PI =3.14;
    private double r,perimeter,area;    //半径、周长、面积
    //有参构造方法，对半径进行初始化
    public Circle(double r){
        this.r=r;
    }
    //返回周长
    double perimeter(){
        perimeter=PI * 2 * r;
        return perimeter;
    }
    //返回面积
    double area(){
        area=PI*r*r;
        return area;
    }
}
