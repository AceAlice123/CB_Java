import java.lang.Math;
class NE{
    public static void main(String[] args) {
        // int arr[]={3,2,4,7,9,1,0};
        // int nge[]=NSEL(arr);
        // display(nge);
        
    }
    public static int [] NGEL (int [] arr ) {
        int n= arr.length;
        int[] NGEL=new int[n];
        NGEL[0]=0;
        int max=arr[0];
        for(int i =0; i<n-1;i++){
            if(arr[i]>max) max=arr[i];
            NGEL[i+1]=max;
        }
        return NGEL;
    }
    public static int [] NGER (int [] arr ) {
        int n= arr.length;
        int[] NGER=new int[n];
        NGER[n-1]=0;
        int max=arr[n-1];
        for(int i =arr.length-1; i>0;i--){
            if(arr[i]>max) max=arr[i];
            NGER[i-1]=max;
        }
        return NGER;
    }
    public static int [] NSER (int [] arr ) {
        int n= arr.length;
        int[] NSER=new int[n];
        NSER[n-1]=0;
        int max=arr[n-1];
        for(int i =arr.length-1; i>0;i--){
            if(arr[i]<max) max=arr[i];
            NSER[i-1]=max;
        }
        return NSER;
    }
    public static int [] NSEL (int [] arr ) {
        int n= arr.length;
        int[] NSEL=new int[n];
        NSEL[0]=0;
        int max=arr[0];
        for(int i =0; i<n-1;i++){
            if(arr[i]<max) max=arr[i];
            NSEL[i+1]=max;
        }
        return NSEL;
    }
    public static void display(int[] arr){
        for (int i: arr){
            System.out.print(i);
        }
    }
}