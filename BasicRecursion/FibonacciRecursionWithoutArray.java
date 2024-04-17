package StriverDSASheet.BasicRecursion;

import java.util.Scanner;

public class FibonacciRecursionWithoutArray {
    static int printFactorial(int n){
        if(n<=1)
            return n;
        int last = printFactorial(n-1);
        int slast = printFactorial(n-2);
        return last+slast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n = sc.nextInt();
        System.out.println(printFactorial(n));
    }
}
