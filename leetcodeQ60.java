import java.util.ArrayList;

import java.util.List;

public class leetcodeQ60 {
    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> nums= new ArrayList();
        for (int i =1; i<=n; i++){
            nums.add(i);
        }
        String ans=permutations("", nums, 3, fact(n, 1));
        System.out.println(ans);
    }
    public static String permutations(String ans,List n, int k , int comb){
        if(ans.length()==0) k--;
        if(n.size()==0) {
            return (ans);
        }
        comb /=n.size();
        int i = k/comb;
        ans+=(char)((int)n.get(i)+48);
        n.remove(i);
        return permutations(ans,n,k%comb,comb);
    }
    public static int fact(int n,int fact ){
        if (n==0 || n==1) return fact;
        return fact(n-1,fact*n); 
    }

}
