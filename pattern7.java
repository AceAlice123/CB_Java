import java.util.Scanner;

public class pattern7 {
    public static void main (String[] args) {
		Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        // int n=5;
        for (int i=1; i<=n;i++){
            for (int j=1;j<=n;j++){
                if(j==n || j==1 || i==1 || i==n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
	}
}
