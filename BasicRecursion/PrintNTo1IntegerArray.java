package StriverDSASheet.BasicRecursion;

import java.util.Scanner;

public class PrintNTo1IntegerArray {
    public static int[] print(int n){
        int temp = n;
        int arr[] = new int[n];
        recursiveCall(n,arr,temp);
        return arr;
    }
    static void recursiveCall(int n,int arr[],int temp){
        if(n==0)
            return;
        recursiveCall(n-1,arr,temp);
        arr[n-1]=temp-n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of n");
        int n = sc.nextInt();
        int arr[] = print(n);
        for(Integer i:arr){
            System.out.print(i+" ");
        }
    }
}
