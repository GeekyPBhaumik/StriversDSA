package StriverDSASheet.BasicRecursion;

import java.util.Scanner;

public class FibonaciRecursion {

    public static int[] generateFibonacciNumbers(int n) {
        int nums[] = new int[n];
        if(n==1){
            nums[0]=0;
        }
        if(n==2){
            nums[0]=0;
            nums[1]=1;
        }
        if(n<3)
            return nums;
        nums[0]=0;
        nums[1]=1;
        int index = 2;
        return fiboNum(nums,n,index);
    }
    static int[] fiboNum(int nums[],int n,int index){
        if(index==n)
            return nums;
        nums[index]=nums[index-2]+nums[index-1];
        index++;
        return fiboNum(nums,n,index);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = generateFibonacciNumbers(n);
        for(Integer e:nums){
            System.out.print(e+" ");
        }
    }
}
