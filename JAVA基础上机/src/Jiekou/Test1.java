package Jiekou;

interface CanFly1 {
    void fly();
}
class Bird implements CanFly1{
    public void fly() {
        System.out.println("鸟儿起飞了");
    }
}
class Plane implements CanFly{
    public void fly() {
        System.out.println("飞机起飞了");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Bird bird = new Bird();
        plane.fly();
        bird.fly();
    }
}

