import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        int [] n={10,30,30,30,40};
        System.out.println(Maxsumsubarr(2,n));
        
    }
    public static List<Integer> Maxsumsubarr(int k , int[] arr){
        int maxsum=0;
        int lt=0;
        int rt=0;
        List<Integer> al = new ArrayList<>();
        // sliding window
        int i =0;
        int j =k-1;
        maxsum=sum(k, arr);
        int tempsum=0;
        j++;
        while(i<j-k+1 && j<arr.length){
            tempsum=maxsum -arr[i]+arr[j];
            i++;
            if(tempsum>maxsum ){lt=i;rt=j;maxsum=tempsum;}
            j++;

        }
        for (int a =lt;a<rt+1;a++ ){
            al.add(arr[a]);
        }
        return al;
    }
    public static int sum(int k,int[] arr){
        int sum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
