package StriverDSASheet.BasicSorting;

public class OptimizedBubbleSort {
    public static int[] optimizedBubble(int arr[]){
         //Best Case For Bubble Sort is when the array is already sorted
        //Time Complexity:O(N)
         int n = arr.length;
         boolean isSwap = false;
         for(int i=n-1;i>=1;i--){
             for(int j=0;j<i;j++){
                 if(arr[j]>arr[j+1]){
                     //swap
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     isSwap = true;
                 }
             }
             if(!isSwap){
                 break;
             }
             System.out.println("Running");
         }
         return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        arr = optimizedBubble(arr);
        for(Integer e:arr){
            System.out.print(e+" ");
        }
    }
}
