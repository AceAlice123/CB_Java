

public class pattern18{
    public static void main(String[] args) {
        int n = 7;
        int sw=0;
        int k=n;
        for (int i=1;i<=n && i>0;i++){
            for(int j=1;j<=k;j++){
                if(j>n-i){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            if(i==(n+1)/2 && sw==0){
                sw=1;
            }
            if(sw==1){
                i-=2;
                k-=2;
            }
            k++;
        }
    }
}
