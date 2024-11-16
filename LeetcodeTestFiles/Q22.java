package LeetcodeTestFiles;
/**
 * Q22
 */
public class Q22 {

    public static void main(String[] args) {
        validParanthesis(3, 3, "");
    }
    public static void validParanthesis(int n,int p, String paran){
        // if (n%2!=0 && n==p) {n--;p--;}
        if(p==0){System.out.println(paran);return;}
        String str1 ="{"+paran+"}";
        String str2=paran+"{}";
        String str3 ="{}"+paran;
        validParanthesis(n,p-1,"{"+paran+"}");
        if(!str1.equals(str2)) {validParanthesis(n,p-1,paran+"{}");}
        if(!str3.equals(str2) && !str3.equals(str1)){validParanthesis(n,p-1,"{}"+paran);}
    }
}

