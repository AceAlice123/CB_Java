import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int k = scn.nextInt(); // min S required
        int s = scn.nextInt();
        char [][] park = new char [n][m];
        for (int i =0; i<n;i++){
            for (int j =0; j<m;j++){
                park[i][j] = scn.next().charAt(0);
            }
        }
        for (int i =0; i<n;i++){
            for (int j =0;j<m && s>=k;j++){
                int t =park[i][j];
                if(t=='.'){
                    s-=3;
                }
                else if(t=='*'){
                    s+=4;
                }
                else if(t=='#'){
                    j=-1;
                    if(i<n-1){i++;}
                }
            }
        }
        if(s>=k){ System.out.println("Yes"); System.out.println(s);}
        else {System.out.println("No");}
    }
}
