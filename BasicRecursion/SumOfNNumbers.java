package StriverDSASheet.BasicRecursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static long sumFirstN(long n) {
        long sum=0;
        if(n==0)
            return 0;
        sum = sumFirstN(n-1) + n;
        return sum;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long sum = sumFirstN(n);
      System.out.println(sum);
    }
}
