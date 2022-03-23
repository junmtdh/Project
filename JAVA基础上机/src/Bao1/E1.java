package Bao1;

class Monkey{
    Monkey(String s){
    }
    public void speak(){
        System.out.println("咿咿呀呀......");
    }
}
class People1 extends Monkey{
    People1(String s){
        super(s);
    }
    public void speak(){
        System.out.println("小样的，不错嘛！会说话了！");
    }
    public void think(){
        System.out.println("别说话，认真思考！");
    }
}
public class E1 {
    public static  void main(String[] args){
        Monkey monkey=new Monkey("ee");
        People1 people=new People1("bb");
        monkey.speak();
        people.speak();
    }
}
