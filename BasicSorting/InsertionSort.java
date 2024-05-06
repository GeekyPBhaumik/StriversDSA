package StriverDSASheet.BasicSorting;

public class InsertionSort {

    public static int[] insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=0;i<size;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    System.out.println("Running");
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        arr = insertionSort(arr,arr.length);
        for(Integer e:arr){
            System.out.print(e+" ");
        }
    }
}
