package StriverDSASheet.BasicRecursion;

import java.util.Scanner;

public class ReverseArray {
    public static int[] reverseArray(int n, int []nums) {
        //Recursive Approach
        int i = 0;
        revArr(i, n-1,nums);
        return nums;
    }
    static void revArr(int start,int end, int nums[]){
        if(start>=(nums.length/2))
            return;
        //swap logic
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start = start+1;
        revArr(start, nums.length-start-1, nums);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int nums[] = {3, 1, 1, 7, 4, 2, 6, 11};//11 6 2 4 7 1 1 3
        nums = reverseArray(n,nums);
        for(Integer e:nums){
            System.out.print(e+" ");
        }
    }
}
