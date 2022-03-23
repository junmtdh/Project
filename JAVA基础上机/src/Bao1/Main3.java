package Bao1;

class Vehicle {
    //定义成员变量
    private int wheels;//轮子个数
    private double weight;//车重
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    //构造方法
    public Vehicle(int wheels, double weight) {
        super();
        this.wheels = wheels;
        this.weight = weight;
    }
}
class Car1 extends Vehicle {
    // 定义新的成员变量
    private int loader;//载人数
    public int getLoader() {
        return loader;
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    // 调用父类构造方法
    public Car1(int wheels, double weight,int loader) {
        super(wheels, weight);
        this.loader=loader;
    }
}
class Truck extends Car1
{
    //添加新的成员变量
    private double payload;//载重量
    public double getPayload() {
        return payload;
    }
    public void setPayload(double payload) {
        this.payload = payload;
    }
    //调用父类构造方法
    public Truck(int wheels, double weight, int loader, double payload ) {
        super(wheels, weight, loader);
        this.payload=payload;
    }
}
public class Main3 {
    public static void main(String[] args) {
        //实例化Vehicle对象
        Vehicle v= new Vehicle(4,3);
        System.out.println("汽车有"+v.getWheels()+"个轮子,它的重量是"+v.getWeight()+"吨");

        //实例化car对象
        Car1 c = new Car1(4,1.5,4);
        System.out.println("小车有"+c.getWheels()+"个轮子,它的重量是"+c.getWeight()+"吨,能载"+c.getLoader()+"个人");

        //实例化Truck对象
        Truck t= new Truck(8,5,3,10);
        System.out.println("卡车有"+t.getWheels()+"个轮子,它的重量是"+t.getWeight()+"吨,能载"+t.getLoader()+"个人,能装"+t.getPayload()+"吨货");
    }
}
