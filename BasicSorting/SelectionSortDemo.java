package StriverDSASheet.BasicSorting;

public class SelectionSortDemo {
    //Selection Sort
    public static int[] selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {13,2,1,4,5,12,12};
        arr = selectionSort(arr);
        for(Integer e:arr){
            System.out.print(e+" ");
        }
    }
}
