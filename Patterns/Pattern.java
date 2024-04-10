package StriverDSASheet.Patterns;

import java.util.Scanner;


public class Pattern {
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printPattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){ // i=1 j=1 , i=2 , j=1,2, i=3,j=1,2,3
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void printPattern4(int n){
        for(int i=1;i<=n;i++){  //i=1, j-> 1 , i=2,j->1 2
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void printPattern5(int n){
        for(int i=n;i>0;i--){//i=3,j->0,1,2, i=2,j->0,1
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printPattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void printPattern7(int n){
        for(int i=0;i<n;i++){  // i=0,space=3,stars=1,space=4
            //printing first layer of space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //printing stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //printing second layer of space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printPattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;//upto i=5 , stars will be equal to i if we observe
            if(i>n){
                stars=2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern11(int n){
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0)
                start=1;
            else
                start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;//flipping it from 1 to 0 and 0 to 1
            }
            System.out.println();
        }
    }
    public static void printPattern12(int n) {
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void printPattern13(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    public static void printPattern18(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+n-j)+" ");
            }
                System.out.println();
        }
    }
    public static void printUpperPart(int n){
        for(int i=0;i<n;i++){
            //stars
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0;j<2*i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printBelowPart(int n){
        for(int i=0;i<n;i++){
            //stars
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0;j<n+1-2*i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printPattern19(int n){
        printUpperPart(n);
        printBelowPart(n);
    }
    public static void printPattern20(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            int spaces=2*(n-i);
            if(i>n){
                stars=2*n-i;
                spaces=2*(i-n);
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printPattern21(int n){
        int stars=n,spaces=0;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                stars=n/2;
                spaces=0;
            }else{
                stars=1;
                spaces=n-2;
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stars
            if((n%2!=0) && (i==1 || i==n)){
                stars=n/2+1;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern22(int n){
        for(int i=0;i<2*n-1;i++){
            //inner loop
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int bottom=2*n-2-i;
                int left=j;
                int right=2*n-2-j;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of test cases");
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            printPattern22(n);
        }
    }
}
