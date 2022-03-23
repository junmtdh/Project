package Jiekou;

interface InterfaceA{
    public abstract void printCapitalLetter();//接口抽象方法
}
interface InterfaceB{
    public abstract void printLowercaseLetter();
}
class Print implements InterfaceA,InterfaceB{
    public void printCapitalLetter(){
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + "\40");
        }
        System.out.println();
    }
    public void printLowercaseLetter(){
        for(char i='a';i<='z';i++){
            System.out.print(i+"\40");
        }
        System.out.println();
    }
}
public class E {
    public static void main(String[] args){

        InterfaceA a=new Print();
        a.printCapitalLetter();

        InterfaceB b=new Print();
        b.printLowercaseLetter();
    }
}
