public class BinarySS {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,17,19};
        System.out.println(BinaryS(arr, 7));
    }
    public static int BinaryS(int[] arr, int q ){
        int lo=0;
        int hi=arr.length;
        int ans=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==q){return mid;}
            else if(arr[mid]>q){hi=mid-1;}
            else{ans=mid;lo=mid+1;}
        }
        return ans;
    }
}
