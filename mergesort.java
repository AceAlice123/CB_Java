public class mergesort {
    public static void mergeSort(int arr[],int low ,int high){
        if(low<high){
            int mid = (high+low)/2;
            mergeSort(arr,low, mid);
            mergeSort(arr,mid, high);
            merge(arr,low , mid ,high);
        }
    }
    public static void merge(int [] arr, int low, int mid, int high ){
        
    }
}
