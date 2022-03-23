package Bao;
class Car{
    private String chepaihao;
    private int chesu;
    private double zaizhongliang;
    //构造器
    Car(){
        chepaihao="XX1234";
        chesu=100;
        zaizhongliang=100;
    }
    //创建参数传递的车辆属性方法
    Car(String chepaihao,int chesu,double zaizhongliang){
        this.chepaihao=chepaihao;
        this.chesu=chesu;
        this.zaizhongliang=zaizhongliang;
    }
    public void highSpeed(int sp)//加速
    { chesu+=sp; }
    public void lowSpeed(int sp)//减速
    {
        if(chesu>=sp)
            chesu-=sp;
        else
            System.out.println("时速不够减速量"+sp);

    }

    public void changeCarNo(String nu)//修改车牌号
    {
        chepaihao=nu;
    }
    public void showSupport()
    {
        System.out.println("载重"+zaizhongliang);
    }
    public void show()
    {
        System.out.println("车牌号："+chepaihao+"，车速："+chesu+"，载重："+zaizhongliang);
    }

}
public class Main4 {
    public static void main(String[] args){
        Car c=new Car();
        c.changeCarNo("川A9752");
        c.show();
        c.highSpeed(20);//加速
        System.out.println("加速20后：");
        c.show();

        System.out.println("\n");
        Car c2=new Car("川B5086",150,200);
        c2.show();
        System.out.println("减速10后:");
        c2.lowSpeed(10);//减速
        c2.show();
    }
}
