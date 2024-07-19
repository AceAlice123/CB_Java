
import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        scn.close();
        int k=n;
        for(int i =1; i<=n; i++){
            for(int j=1;j<=k;j++){
                if (j>n-i){
                    if(j==k) {
                        System.out.print(" *");
                    }
                    else{
                        System.out.print(" * !");
                        j++;
                    }   
                }
                else{
                    System.err.print("  ");
                }
            }
            System.out.println();
            k++;

        }
    }
}
