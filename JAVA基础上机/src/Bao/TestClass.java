package Bao;

public class TestClass {
    public static void main(String[] args){
    Clock time=new Clock(11,57,59);
    time.show();
    Clock shi=new Clock(19,10,12);
    shi.show();
    }
}
class Clock{
   private int hour,minute,second;
   Clock(int hours,int minutes,int seconds){
    hour=hours;minute=minutes;second=seconds;
   }
   void show(){
       System.out.println(hour+":"+minute+":"+second);
   }
}