import java.math.BigInteger;

public class recursion {
    public static void main(String[] args) {
        // System.out.println(factorial(52));
        // System.out.println(power2(2, 5,1));
        // System.out.println(fibonaccai(4));
        // subsequence("CAR","");
        // // cointoss(3,"");
        // System.out.println(tosscount(3));
        // System.out.println(countsubsequence2("CAR",1));
        validParanthesis(4,4,"");
        // String n= "ABC";
        // System.out.println(n.substring(0, 1)+n.substring(3));
        // permutations("ABCD","");
        // System.out.println("  ////");
        // permutations2("ABCD", "", 1);


    }
    public static BigInteger factorial(int n){
        Integer p = n;
        BigInteger z = BigInteger.valueOf(p.intValue());
        if (n==1 || n==0) return BigInteger.valueOf(1);
        BigInteger x = z.multiply(factorial(n-1));
        return x;
    }
    // head recursion
    public static int power(int base,int pow){
        if(pow==0) return 1;
        return base*power(base, pow-1);

    }
    // tail recursion
    public static int power2(int base,int pow, int ans){
        if(pow==0) return ans;
        return power2(base, pow-1,base*ans);

    }
    // fibonacci 
    public static int fibonaccai(int n){
        if (n==0 || n==1) return n;
        int fb1=fibonaccai(n-1);
        int fb2 = fibonaccai(n-2);
        return fb1+fb2;
    }
    public static void subsequence(String n, String ans){
        if (n.length()==0) {System.out.println(ans);return;}
        char z = n.charAt(0);
        subsequence(n.substring(1),ans+z);
        subsequence(n.substring(1),ans);
    }
    public static void cointoss(int n, String ans){
        if (n==0) {System.out.println(ans);return;}
        cointoss(n-1, ans+"H");
        cointoss(n-1, ans+"T");
    }
    public static int  tosscount(int n){
        if (n==0) {return 0;}
        if(n==1) {return 2;}
        return tosscount(n-1)+tosscount(n-1);

    }
    public static int countsubsequence(String q){
        if (q.length()==0) return 1;
        return countsubsequence(q.substring(1))+countsubsequence(q.substring(1));
    }
    public static int countsubsequence2(String q,int count){
        if (q.length()==0) return count;
        return countsubsequence2(q.substring(1),2*count);
    }
    public static void validParanthesis(int n,int p, String paran){
        // if (n%2!=0 && n==p) {n--;p--;}
        if(p==0){System.out.println(paran);return;}
        validParanthesis(n,p-1,"{"+paran+"}");
        if(n!=p) validParanthesis(n,p-1,paran+"{}");
    }
    public static void permutations(String n, String ans){
        if(n.length()==0) {System.out.println(ans);return;}
        for (int i =0; i<n.length();i++){
            permutations(n.substring(0, i)+n.substring(i+1), ans+n.charAt(i));
        }
        
    }
    public static void permutations2(String n, String ans, int k ){
        if(ans.length()==0) k--;
        if(n.length()==1) {
            System.out.println(ans+n);
            return;
        }
        int comb = fact(n.length()-1);
        int mod=k%comb;
        int i = k/comb;
        permutations2(n.substring(0, i)+n.substring(i+1), ans+n.charAt(i),mod);
    }
    public static int fact(int n ){
        if (n==0 || n==1) return 1;
        return n*fact(n-1); 
    }

    
}
