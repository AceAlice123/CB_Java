
import java.util.Arrays;
public class Two_Darr {
    public static void main(String[] args) {
        int [][] nums ={{1,3,2},{4,5,6},{7,3,9}};
        int [][] nums2 ={{1,2,3,4},{4,5,6},{7,8}};
        // display2d(nums);
        // System.out.println();
        // display2d(nums2);
        // int sum=sum2d(nums2);
        // System.out.println(sum);

        // int idx[]=new int[2];
        int [] idx=search2d(nums2, 9);
        System.out.println(idx[0]+" "+idx[1]);

        sortcomplete(nums);
        display2d(nums);
        
    }
    public static void display2d(int[][] n){
        for (int i =0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int sum2d(int[][] n){
        int sum=0;
        for (int i =0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                sum+=n[i][j];
            }
        }
        return sum;

    }
    public static int[] search2d(int[][] n,int q){
        int[] ans= new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for (int i =0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(q==n[i][j]){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
        
    }
    public static void Transpose(int[][] n){
        for (int i =0;i<n.length;i++){
            for(int j=i;j<n[i].length;j++){
                int temp=n[j][i];
                n[j][i]=n[i][j];
                n[i][j]=temp;
            }
        }
    }
    public static void sortBycols(int[][] nums){
        Arrays.sort(nums,(a,b)-> Integer.compare(a[0], b[0]));
    }
    public static void sortcomplete(int[][]n){
        int[] oned = flatten(n);
        Arrays.sort(oned);
        fillarr(n, oned);

    }
    public static int[] flatten(int[][] n){
        int[] oned=new int [(n.length*n[0].length)];
        int col=n[0].length;
        for (int i =0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                oned[col*i+j]=n[i][j];
            }
        }
        return oned;

    }
    public static void fillarr(int[][] n,int[] oned){
        int col =n[0].length;
        for (int i =0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j]=oned[col*i+j];
            }
        }


    }

    
}
