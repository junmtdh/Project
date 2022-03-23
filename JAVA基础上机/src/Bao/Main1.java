package Bao;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Account test=new Account();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入存款金额：");
        test.deposit(input.nextInt());
        test.query();
        System.out.println("请输入取款金额：");
        test.withdrawals(input.nextInt());
        test.query();
        
    }
}
class Account{
    private  String accountNumber;
    private float balance=0;//余额
    //存
    float deposit(int money){
        balance+=money;
        return  balance;
    }
    //取
    float withdrawals(int money){
        balance-=money;
        return balance;
    }
    void query(){
        System.out.println("余额为："+balance);
    }
}