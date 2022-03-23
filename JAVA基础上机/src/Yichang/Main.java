package Yichang;

class MyException extends Exception{
    MyException(int m){
        System.out.println("m大于1000");
    }
}
class Student{
    public void speak(int m) throws MyException{
        if(m>1000) {
            throw new MyException(m);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.speak(1500);
        } catch (Exception e) {
            System.out.println("传入的值出现异常:" + e);
        }
    }
}