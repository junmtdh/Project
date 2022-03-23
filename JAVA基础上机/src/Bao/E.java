package Bao;

import static java.lang.Math.pow;

public class E {
    public static void main(String[] args){
    Print.output();
    }
}
class Print {
    public static void output() {
        for (int i = 100; i <= 999; i++) {
            if (i == pow(i % 10, 3) + pow(i / 10 % 10, 3) + pow(i / 100, 3))
                System.out.print(i + "\40");
        }
    }
}