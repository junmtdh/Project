package Bao1;

class Human{
    String name;
    int age;
    float height;
    public Human(String name,int age,float height){
         this.name=name;
         this.age=age;
         this.height=height;
     }
     //成员方法
    public void speak(){
        System.out.println("你最喜欢的水果是什么?");
    }
    public void answer(){
        System.out.println("我最喜欢的水果是：所有水果");
    }
}
class Man extends Human {
    public Man(String name, int age, float height) {
        super(name, age, height);
    }
    //重写父类的方法
    public void speak()
    {
        System.out.println("我是男生，我叫"+name+"我的年龄是："+age+"我的身高为："+height);
    }
    public void answer()
    {
        System.out.println("我最喜欢的水果是香蕉");
    }
}
class Woman extends Human {
    public Woman(String name, int age, float height) {
        super(name, age, height);
    }
    //重写父类方法
    public void speak()
    {
        System.out.println("我是女生，我叫"+name+"我的年龄是："+age+"我的身高为："+height);
    }
    public void answer()
    {
        System.out.println("我最喜欢的水果是水蜜桃");
    }
}
public class Test1 {
    public static void main(String[] args){
        //实例化Man对象
        Man m=new Man("小明",18,178);
        m.speak();
        m.answer();
        //实例化woman对象
        Woman w = new Woman("小丽",19,168);
        w.speak();
        w.answer();

        //实例化对象
        Human h=new Human("人类",3000,2);
        h.speak();
        h.answer();

        //定义上转型对象
        Human hm=new Man("张三",20,196);
        hm.speak();
        hm.answer();
    }
}
