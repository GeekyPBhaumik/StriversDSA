package StriverDSASheet.BasicSorting;

import java.util.ArrayList;

public class MergeSortCodingNinjas {
    public static int[] mergeSort(int[] arr, int n) {
        //3 1 2 4 5 --> low =0 , high=4, mid=2
        //3 1 2 --> low=0,high=2, mid=1 , 4 5 --> low=3,high=4, mid=3
        //3 1 --> low=0, high=1, mid=0, 2 --> low=2, high=2, mid=2 , 4 --> low-> 3,high=3,mid=3  5,low=5,mid=5,high=5
        //3 --> low=0,high=0,mid=0 , 1 --> low=1,high=1,mid=1  //2 --> low=2,high=2
        int low = 0;
        int high = arr.length-1 ;
        mergeSorted(arr,low,high);
        return arr;
    }
    public static void mergeSorted(int arr[],int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSorted(arr, low, mid);
        mergeSorted(arr, mid+1, high);
        merge(arr,low,mid,high); //Merges the 2 halfs
    }
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> arrList = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                arrList.add(arr[left]);
                left++;
            }else{
                arrList.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            arrList.add(arr[left]);
            left++;
        }
        while(right<=high){
            arrList.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            //when say for array 3 1 2 4 5
            //it is divided in 3 1 2 & 4 5
            //low = 0 , high = 2 , low=3, high = 4 , because everytime we are
            //creating a new ArrayList
            //arr[3] = arrList.get(3-3) i.e.arrList.get(0);
            //arr[4] = arrList.get(4-3) i.e.arrList.get(1);
            arr[i] = arrList.get(i-low);
        }
    }
    public static void main(String args[]){
        int arr[] = {2,1,33,4,12};
        arr = mergeSort(arr,arr.length);
        for(Integer e:arr){
            System.out.println(e);
        }
    }
}
