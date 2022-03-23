package Bao;

public class Array1 {
    public static void main(String[] args){
        int a[]={3,4,5,6,7};
        int b[]={1,2,3,4,5,6,7};
        for(int i=0;i<b.length;i++){
            if(i<5)
            b[i]*=a[i];
            System.out.print(b[i]+"\t");
        }
    }
}
