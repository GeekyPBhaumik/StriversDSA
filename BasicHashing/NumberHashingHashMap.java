package StriverDSASheet.BasicHashing;

import java.util.HashMap;
import java.util.Scanner;

public class NumberHashingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println("Enter the number of array elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();
        while(q>0){
            int number = sc.nextInt();
            System.out.println(number + "->" +map.getOrDefault(number,0));
            q--;
        }
    }
}
