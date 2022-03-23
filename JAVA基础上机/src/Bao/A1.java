package Bao;
class Sanjiaoxing{
    private float a,b,c;
    Sanjiaoxing(float a,float b,float c){
        this.a=a;this.b=b;this.c=c;
    }
    float c(){
        return a+b+c;
    }
}
public class A1 {
    public static void main(String args[]){
        Sanjiaoxing test =new Sanjiaoxing(3,4,5);
        System.out.println(test.c());
    }
}
