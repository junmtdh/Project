package Bao1;

//创建Person类
class Person {
    String name;
    String address;
    String telphone;
    String email;
}
//创建Person子类Employee类
class Employee extends Person {
    String office;
    double wage;
    String hiredate;
}
//创建Employee子类Faculty类
class Faculty extends Employee{
    String degree;
    String level;
}
//创建Employee子类Staff类
class Staff extends Employee{
    String duty;
}
public class Main1 {
    public static void main(String[] args){

    }
}
