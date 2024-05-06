package StriverDSASheet.BasicSorting;

public class BubbleClassDemo {
    public static int[] bubbleSortArray(int arr[]){
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<i;j++){ //in each iteration, largest element pushes to the right
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
             }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {12,1,3,40,87,23,31};
        arr = bubbleSortArray(arr);
        for(Integer e:arr){
            System.out.print(e+" ");
        }
    }
}
