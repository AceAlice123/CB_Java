public class numerpad {
    public static String[] arr={"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    public static void main(String[] args) {
        permutations("245","");
    }
    public static void permutations(String n, String ans){
        if(n.length()==0) {System.out.println(ans);return;}
        int idx=(n.charAt(0)-48);
        for(int j=0; j<arr[idx].length();j++){
            permutations(n.substring(1), ans+arr[idx].charAt(j));
        }
        
    }
}
