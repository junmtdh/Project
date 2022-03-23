package Jiekou;

interface Charge{
    double price=0.5;//每公里0.5元
    double chargeMoney();//收取费用的方法
}

class Train implements Charge{
    int  distance;//行驶的公里数
    public double chargeMoney(){
        double pay =distance*0.5;
        System.out.println("行驶了"+distance+"公里,应该收费"+pay);
        return pay;
    }
}

public class Main {
    public static void main(String[] args) {
        Train t= new Train();
        t.distance = 1000;//此处输入公里数
        t.chargeMoney();
    }
}

