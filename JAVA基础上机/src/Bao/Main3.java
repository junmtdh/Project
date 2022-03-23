package Bao;
class People{
    private String name,sex;
    private int age;
    private float height;
    People(String name,int age,String sex,float height){
        this.name=name;this.age=age;
        this.sex=sex;this.height=height;
    }
    public void talk(){
        System.out.println("你好！");
    }
    public void plus(){
        System.out.println(23+45);
    }
    public void modify(){
        this.name="李四";
        System.out.println(name);
    }
}
public class Main3 {
    public static void main(String[] args){
    People people=new People("张三",18,"男",1.80f);
    people.talk();
    people.plus();
    people.modify();
    }
}
