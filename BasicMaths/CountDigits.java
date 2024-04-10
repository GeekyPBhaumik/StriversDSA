package StriverDSASheet.BasicMaths;

import java.util.Scanner;

public class CountDigits {

    public static int countDigits(int n){
        int temp=n;
        int count=0;
        while(temp>0){
            int digit=temp%10;
            if(digit!=0 && n%digit==0){
                count++;
            }
            temp=temp/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter The No.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count = countDigits(n);
        System.out.println(count);
    }
}
