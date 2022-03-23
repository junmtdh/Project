package Bao;

public class TestClass1 {
    public static void main(String[] args){
    Student student=new Student(181002,"张三",18);
    student.outPut();
    }
}
class Student{
    private int stuNo;
    private String name;
    private int age;
    Student(int stuNo,String name,int age){
        this.stuNo=stuNo;this.name=name;
        this.age=age;
    }
    void outPut(){
        System.out.println("学号："+stuNo);
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }
}