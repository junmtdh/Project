package Bao;

class Cat{
    protected   String name,maoSe;
    protected   int age;
    public  void show_name(){
        System.out.println(name);
    }
    public void hanJiao(){
        System.out.println("喵~喵~");
    }
}
public class Main2 {
    public static void main(String[] args){
        Cat cat=new Cat();
        cat.name="妮妮";
        cat.maoSe="灰色";
        cat.age=2;
        System.out.println(cat.maoSe);
        System.out.println(cat.age);
        cat.show_name();
        cat.hanJiao();
    }
}
