package Bao;

class XiYouJiRenWu{
    private float height;   //身高
    private String name,weapon; //名字，武器
    //定义构造器
    XiYouJiRenWu(String name,String weapon){
        this.name=name;
        this.weapon=weapon;
    }
    //定义显示名字的方法
    void printName(){
        System.out.println(name);
    }
    //定义显示武器的方法
    void printWeapon(){
        System.out.println(weapon);
    }
}

public class Main {
    public static void main(String[] args){
        XiYouJiRenWu zhuBaJie=new XiYouJiRenWu("猪八戒","九齿钉耙");
        //调用printName, printWeapon方法并显示属性值
        zhuBaJie.printName();
        zhuBaJie.printWeapon();
        XiYouJiRenWu sunWuKong=new XiYouJiRenWu("孙悟空","金箍棒");
        //调用printName, printWeapon方法并显示属性值
        sunWuKong.printName();
        sunWuKong.printWeapon();
    }
}