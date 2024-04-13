package StriverDSASheet.BasicMaths;

import java.util.Scanner;

public class PalindromeNum {

    static boolean isPalindrome(int n){
        String str = Integer.toString(n);
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter The No.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPalin = isPalindrome(n);
        System.out.println(isPalin);
    }
}
