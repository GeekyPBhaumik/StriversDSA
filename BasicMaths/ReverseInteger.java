package StriverDSASheet.BasicMaths;

import java.util.Scanner;

public class ReverseInteger {

    public static int reverse(int n) {
        int rev=0;
        int temp = Math.abs(n);
        while(temp>0){
            rev = rev * 10 + (temp%10);
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
            temp=temp/10;
        }
        if(n<0){
            rev = -rev;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter The No.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse = reverse(n);
        System.out.println(reverse);
    }
}
