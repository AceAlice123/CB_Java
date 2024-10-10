
import java.util.Scanner;


public class Functions{

    public static void main(String[] args) {
        // Natural_Numbers(args);
        // CheckPrime(args);
        // Reverse_n(args);
        // count_digits(1234);
        armstrong_number(args);
    }
    public static boolean CheckPrime(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int i=2;i<=Math.sqrt(n) ;i++){
            if (n%i==0){
                System.out.println("Not Prime");
                return false;

            }

        }
        System.out.println("Prime");
        return true;
        
    }
    public static void Natural_Numbers(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int i=1;i<n ;i++){
            System.out.println(i);
        }

    }
    public static int Reverse_n(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int r = 0;
        while(n>0){
            r = r*10+n%10;
            n=n/10; 
        }
        System.out.println(r);
        return r;
    }
    public static  int count_digits(int n2) {
        int n =  n2;
       
        int count = 0;
        while(n>0){
            n=n/10;
            count+=1; 
        }
        return count;
        
    }
    public static  boolean armstrong_number(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int dig=0;
        int sum=0;
        int k=n;
        int d = count_digits(n);
        while(n>0){
            dig=n%10;
            n=n/10;
            sum+=Math.pow(dig,d);
        }
        if (sum==k){
            System.out.println("Armstrong Number");
            return true;
        }
        else{
            System.out.println("Not an Armstrong Number");
            return false;
        }
        
        
    }
}
