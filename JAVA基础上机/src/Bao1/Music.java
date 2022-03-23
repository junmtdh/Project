package Bao1;
class Instrument{
    public void play(){
        System.out.println("弹奏乐器 ");
    }
}
class Wind extends Instrument{
    public void play(){
        System.out.println("弹奏Wind");
    }
    public void play2(){
        System.out.println("调用wind的play2");
    }
}
class Brass extends Instrument{
    public void play(){
        System.out.println("弹奏brass");
    }
    public void play2(){
        System.out.println("调用brass的play2");
    }
}
public class Music {
    public static void tune(Instrument i){
        i.play();
    }
    public static void main(String[] args){
      Wind wind=new Wind();
      tune(wind);
      wind.play2();

      Brass brass=new Brass();
      tune(brass);
      brass.play2();
    }
}
