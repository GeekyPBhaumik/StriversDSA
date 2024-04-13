package StriverDSASheet.BasicMaths;

import java.util.Scanner;

public class Armstrong {

    public static void isArmstrong(int n){
        int temp=n;
        int count=0;
        int sum=0;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        temp=n;
        while(temp!=0){
            sum = sum + (int)Math.pow((temp%10),count);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter The No.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isArmstrong(n);
    }
}
