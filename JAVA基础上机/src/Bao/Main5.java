package Bao;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    array[i][j] = 1;
                else
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

//方法二：
        int[][] array1 = new int[n][];
        for (int i = 0; i < array1.length; i++) {
            array1[i]=new int[i+1];
        }
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                if (j == 0 || j == i)
                    array1[i][j] = 1;
                else
                    array1[i][j] = array1[i - 1][j - 1] + array1[i - 1][j];
            }
        }
        for(int[] r:array1){
            for(int b:r){
                System.out.print(b+"\t");
            }
            System.out.println();
        }
    }
}
