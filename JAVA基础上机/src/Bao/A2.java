package Bao;
class Point{
    private float x,y;
    public  float getX(){
        return x;
    }
    public void setX(){
        this.x=x;
    }
   public Point(float x,float y){
        this.x=x;
        this.y=y;
   }
}
public class A2 {
    public static void main(String[] args){
        Point test=new Point(3.14f,1.414f);
        System.out.println(test.getX());
    }
}
