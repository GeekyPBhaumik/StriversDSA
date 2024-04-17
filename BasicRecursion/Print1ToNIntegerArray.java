package StriverDSASheet.BasicRecursion;

import java.util.Scanner;

public class Print1ToNIntegerArray {
    public static int[] print(int n){
        int arr[] = new int[n];
        recursiveCall(n,arr);
        return arr;
    }
    static void recursiveCall(int n,int arr[]){
        if(n==0)
            return;
        recursiveCall(n-1,arr);
        arr[n-1]=n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = print(n);
        for(Integer i:arr){
            System.out.println(i+" ");
        }
    }
}
