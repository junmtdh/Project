package Bao1;

class Rect{
    protected int width,height;
    public Rect(){//构造Rect无参方法
        width=height=10;
    }
    public Rect(int width,int height) {//构造Rect有参方法
        this.width = width;
        this.height = height;
    }
    //构造计算面积area和周长perimeter两个方法
    public void area(){
        System.out.println("矩形的面积为："+width*height);
    }
    public void perimeter(){
        System.out.println("矩形的周长为："+(width+height)*2);
    }
}
//继承Rect类来编写确定位置的矩形类PlainRect
class PlainRect extends Rect {
    int startX, startY;

    //无参的PlainRect构造方法
    public PlainRect() {
    }

    //有参数的PlainRect构造方法
    public PlainRect(int width, int height, int startX, int startY) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    //判断某个点是否在矩形内部的方法isInside
    public void isInside(double x, double y) {
        if (x >= startX && x <= (startX + width) && y < startY && y >= (startY - height)) {
            System.out.println("点" + x + "点" + y + "在矩形内部");
        } else {
            System.out.println("点" + x + "点" + y + "不在矩形内部");
        }
    }
}

public class Test{
    public static void main(String[] args){
        //创建一个左上角坐标为（10，10），长为20，宽为10的矩形对象
        PlainRect plainRect = new PlainRect(20,10,10,10);
        // 计算并打印输出矩形的面积和周长
        plainRect.area();
        plainRect.perimeter();
        //判断点(25.5，13)是否在矩形内，并打印输出相关信息
        plainRect.isInside(25.5,13);
        }
}

