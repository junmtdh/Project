package Bao1;

class People{
    protected double height;
    protected double weight;
    public void speakHello(){}
    public void averageHeight(){}
    public void averageWeight(){}
}
class ChinaPeople extends People{
    public void chinaGongfu(){
        System.out.println("坐如钟，站如松，睡如弓");
    }
    public void speakHello(){
        System.out.println("重写打招呼方法");
    }
    public void averageHeight() {
        System.out.println("重写平均身高方法");
    }
    public void averageWeight() {
        System.out.println("重写平均体重方法");
    }

}

class AmericanPeople extends People{
    public void americanBoxing(){
        System.out.println("直拳");
    }
    public void speakHello(){
        System.out.println("重写打招呼方法");
    }
    public void averageHeight() {
        System.out.println("重写平均身高方法");
    }
    public void averageWeight() {
        System.out.println("重写平均体重方法");
    }
}
public class Main {
    public static void main(String[] args){
        ChinaPeople c=new ChinaPeople();
        c.chinaGongfu();
        c.speakHello();
        c.averageHeight();
        c.averageWeight();

        AmericanPeople a=new AmericanPeople();
        a.americanBoxing();
        a.speakHello();
        a.averageHeight();
        a.averageWeight();
    }
}

