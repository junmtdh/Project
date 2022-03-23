package Bao1;

class Rectangle {
    //成员变量
    private double width;
    private double chang;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getChang() {
        return chang;
    }
    public void setChang(double height) {
        this.chang = height;
    }
    //成员方法
    public double area()
    {
        return this.width*this.chang;
    }
}
class Cft extends Rectangle{
    //定义新的成员变量高
    private double height;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //定义新的成员方法求体积
    public double tiji()
    {
        return this.getChang()*this.getHeight()*this.getWidth();
    }
}
public class Main2 {
    public static void main(String[] args) {
        //实例化矩形对象求面积
        Rectangle j= new Rectangle();
        j.setWidth(10);
        j.setChang(23.5);
        System.out.println("矩形的长为："+j.getChang()+"  宽为："+j.getWidth());
        System.out.println("矩形的面积为："+j.area());

        //实例化长方体对象求体积
        Cft c = new Cft();
        c.setChang(20);
        c.setWidth(10);
        c.setHeight(5);
        System.out.println("长方体的长为："+c.getChang()+"  宽为："+c.getWidth()+"  高为："+c.getHeight());
        System.out.println("长方体底面积："+c.getChang()*c.getWidth());
        System.out.println("长方体的体积为："+c.tiji());
    }
}
