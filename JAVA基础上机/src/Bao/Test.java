package Bao;

public class Test {
    public static void main(String[] args){
        int[] x=new int[50];
        for(int i=1,j=0;i<=99;i+=2){
            x[j++]=i;
            System.out.print(x[j - 1] + "\40");//输出，然后空格分开
            if(j%10==0)//输出10个换行
                System.out.println();
        }

        char[][] y=new char[10][10];
        for(int i=0;i<y.length;i++) {
            for (int j = 0; j < y[i].length; j++) {
                if (i == j || i + j == 9)
                    y[i][j] = '*';
                else
                    y[i][j] = '#';
                System.out.print(y[i][j] + "\40");//输出，然后空格分开
            }
            System.out.println();//换行
        }
    }
}
