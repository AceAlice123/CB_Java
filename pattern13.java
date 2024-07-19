
import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int m= 2*n-1;
        int k= 1;
        int sw=0;
        for (int i=1;i<=m;i++){
            for(int j=1;j<=k;j++){
                System.out.print(" *");
            }
            System.out.println();
            if(k==n && sw==0){
                sw=1;
            }
            if(sw==1){
                k-=2;
            }
            k++;
        }
    }
}
