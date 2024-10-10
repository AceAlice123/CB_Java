
import java.util.Scanner;


public class Ques2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum =0;
        for (int i=n;i>0 ;i--){
            sum+=i;
        }
        System.out.println(sum);
    }
}
