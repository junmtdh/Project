package Jiekou;

interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}
abstract class ActionCharacter {
    //抽象方法
    void fight(String emp){
    }
    //输出s
    void speak(String s){
        System.out.println(s);
    }

}
class Hero extends ActionCharacter implements CanSwim,CanFly{
    String name;

    public Hero(String name){
        this.name = name;
    }
    //实现父类中的所有方法
    public void fly() {
        System.out.println(name+"飞翔");
    }
    public void swim() {
        System.out.println(name+"游泳");
    }
}
public class Adventure {
    public static void main(String[] args) {

        Hero hb = new Hero("张三");
        hb.swim();
        hb.fight("战斗");
        hb.fly();

        CanFly cf=hb;
        cf.fly();

        CanSwim cs=hb;
        cs.swim();

        ActionCharacter ac=hb;
        ac.fight("主战");
        ac.speak("说话");
    }

}

