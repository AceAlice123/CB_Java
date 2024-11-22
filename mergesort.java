import java.util.Arrays;
import java.util.Random;

class mergesort{
    public static void main(String[] args) {
        Random r1 = new Random();
        int n = 10;
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=r1.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void mergesort(int [] arr){
        //divide
        int length=arr.length;
        if(length <2){return;}
        int midindex= length/2;
        // left array
        int [] leftarr=Arrays.copyOfRange(arr,0, midindex);
        // right array
        int [] rightarr= Arrays.copyOfRange(arr,midindex, length);
        // calling the mergesort on both side recursively
        mergesort(leftarr);
        mergesort(rightarr);
        //
        megre(arr, leftarr,rightarr );

       

    }
    public static void megre(int[] arr, int[] leftarr,int[] rightarr )  {
        int index=0,l=0,r=0;
        while(l<leftarr.length){
            if(r < rightarr.length ){
                if(leftarr[l]<rightarr[r]){
                    arr[index++]=leftarr[l++];
                }
                else{arr[index++]=rightarr[r++];}
            }
            else{arr[index++]=leftarr[l++];}
        }
        while (r<rightarr.length) {
            arr[index++]=rightarr[r++];
        }


    }
}