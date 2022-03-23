package Bao1;

class Shape {
    //定义成员变量
    private double zhouchang;
    private double area;
    public double getZhouchang() {
        return zhouchang;
    }
    public void setZhouchang(double zhouchang) {
        this.zhouchang = zhouchang;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
}
class Sanjiao extends Shape
{
    //定义新的成员方法用来求周长
    public String qiuZC(double bian1,double bian2,double bian3)
    {
        if((bian1+bian2)>bian3&&(bian2+bian3)>bian1&&(bian1+bian3)>bian2)
            return "三角形的周长为："+(bian1+bian2+bian3);
        else
            return "该三角形的边长不合法，两边之和必须大于第三边";
    }

}
class Rectangle1 extends Shape
{
    //定义新的成员方法用来求周长
    public String qiuZC(double chang, double kuan)
    {
        if(chang>0&&kuan>0)
            return "矩形的周长为："+2*(chang+kuan);
        else
            return "该矩形的长和宽不合法，长和宽必须大于0";
    }
}
public class E4{
    public static void main(String[] args) {
        //实例化三角形对象
        Sanjiao sj = new Sanjiao();
        System.out.println(sj.qiuZC(3, 4, 5));

        System.out.println("面积");
        Shape a=sj;
        a.setArea(6);
        System.out.println(a.getArea());

        //实例化矩形对象
        Rectangle1 jx= new Rectangle1();
        System.out.println(jx.qiuZC(10, 8.5));

        System.out.println("面积");
        Shape b=jx;
        b.setArea(85);
        System.out.println(b.getArea());
    }
}
