package StriverDSASheet.BasicMaths;

import java.util.Scanner;

public class NthRoot {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        if(m<n){
            return -1;
        }
        double nthRoot = Math.pow(m,1.0/n);
        double roundedRoot = Math.round(nthRoot * 1000000) / 1000000.0;
        String x = Double.toString(roundedRoot);
        if(!x.contains(".0")){
            return -1;
        }
        return (int)roundedRoot;
    }

    public static void main(String[] args) {
        System.out.println("Enter The No.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();//n=3,m=27
        int nthRoot = NthRoot(n,m);
        System.out.println(nthRoot);
    }
}
