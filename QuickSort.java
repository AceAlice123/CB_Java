import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr={3,4,2,1,9,8,0};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr,int low , int high ){
        if (low<high){
            int pi=sortaroundP(arr,low, high); // returns the position of the pivot after arranging left and right elements
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static int  sortaroundP(int[] arr, int low, int high){
        int pivot = arr[high];
        int idx=low;
        int swap=low;
        while(idx<=high){
            if(arr[idx]<pivot){
                Swap(arr, swap, idx);
                swap++;
            }
            idx++;
        }
        Swap(arr, swap, high);
        return swap;

    }
    public static void Swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
