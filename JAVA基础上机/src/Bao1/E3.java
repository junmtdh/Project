package Bao1;

class Animal
{
    //成员属性
    private String kind;
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    //成员方法
    public void eat(){
    }
    public void sleep(){
    }
}
class Fish extends Animal {
    // 定义新的成员方法
    public void speak() {
        System.out.println("我是" + this.getKind());
    }
    // 重写父类成员方法
    public void eat() {
        System.out.println("我喜欢吃水藻");
    }
    public void sleep() {
        System.out.println("我睡觉时睁着眼睛");
    }
}
class Dog extends Animal {
    // 定义新的成员方法
    public void speak() {
        System.out.println("我是" + this.getKind());
    }
    // 重写父类成员方法
    public void eat() {
        System.out.println("我喜欢吃肉骨头");
    }
    public void sleep() {
        System.out.println("我一般睡觉得很晚");
    }
}

public class E3{
    public static void main(String[] args) {

        //实例化fish对象
        Fish f = new Fish();
        f.setKind("小鱼");
        f.speak();
        f.eat();
        f.sleep();

        //实例化dog对象
        Dog d = new Dog();
        d.setKind("小狗");
        d.speak();
        d.eat();
        d.sleep();
    }
}

