

public class pattern17 {
    public static void main(String[] args) {
        int n = 7;
        int sw=0;
        int k=(n+1)/2;
        for (int i=1;i<=n && i>0;i++){
            for(int j=1;j<=n+1;j++){
                if(j>k-i && j<=k+i){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
            if(i==k && sw==0){
                sw=1;
            }
            if(sw==1){
                i-=2;
            }
            
        }
    }
}
