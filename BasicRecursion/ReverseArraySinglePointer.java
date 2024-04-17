package StriverDSASheet.BasicRecursion;

public class ReverseArraySinglePointer {
    static int[] reverseSinglePointer(int start, int[] nums){
        //Base Condition
        if(start>=nums.length/2){
            return nums;
        }
        int temp=nums[start];
        nums[start]=nums[nums.length-start-1];
        nums[nums.length-start-1]=temp;
        reverseSinglePointer(start+1,nums);
        return nums;
    }
    public static void main(String[] args) {
        int n = 8;
        int nums[] = {3, 1, 1, 7, 4, 2, 6, 11};
        int start=0;
        nums =reverseSinglePointer(start,nums);
        for(Integer e:nums){
            System.out.print(e+" ");
        }
    }
}
