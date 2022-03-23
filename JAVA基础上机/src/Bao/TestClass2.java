package Bao;

import java.util.Scanner;

public class TestClass2 {
    public static void main(String[] args){
        Print1 test=new Print1();
        System.out.println("大写字母：");
        test.output(1);
        System.out.println("\n小写字母：");
        test.output(2);
    }
}
class Print1{
    void output(int x){
        if(x==1){
            for(char i='A';i<='Z';i++){
                System.out.print(i+"\40");
            }
        }
         if(x==2){
            for(char i='a';i<='z';i++){
                System.out.print(i+"\40");
            }
        }
    }
}