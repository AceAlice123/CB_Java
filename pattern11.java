import java.util.Scanner;

public class pattern11 {
    public static void main(String[] agrs){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        int k=n;
        for (int i =1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(j>n-i){
                    System.out.print(" *  ");
                    j++;
                }
                else{
                    System.out.print("  ");
                    
                }
            }
            System.out.println();
            k++;

        }
    }
}
