import java.util.Scanner;

public class pattern3 {
    public static void main (String[] args) {
		Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        // int n=5;
        for (int i=n; i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
	}
}
