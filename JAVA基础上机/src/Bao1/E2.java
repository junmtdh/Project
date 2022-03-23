package Bao1;

class Car{
    //final属性
    final String pinpai = "品牌";
    public void drive(){
        System.out.println("功能drive");
    }
}
class Aodi extends Car{
    int price = 1000000;
    int id =1234;  //型号
    public void changeSpeed(){
        System.out.println("变速功能");
    }
}
class BenChi extends Car{
    int price =1200000;
    int id = 6789;  //型号
    public void changeSpeed(){
        System.out.println("变速功能");
    }
}
public class E2 {
    public static void main(String[] args) {
        Aodi a = new Aodi();
        System.out.println("车的品牌为："+a.pinpai +"\t价格为："+a.price);
        BenChi b = new BenChi();
        System.out.println("车的品牌为："+b.pinpai +"\t价格为："+b.price);
    }
}
