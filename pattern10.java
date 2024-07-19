import java.util.Scanner;

public class pattern10 {
    public static void main(String[] agrs){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int k =-(n-1);
        for (int i =1; i<=n;i++){
            for(int j=n;j>k;j--){
                if(i-1>n-j){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" *");
                }
            }
            k++;
            System.out.println();

        }
    }
    
    
}
