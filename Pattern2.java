/*package whatever //do not write package name here */

import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        // int n=5;
        for (int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
	}
}