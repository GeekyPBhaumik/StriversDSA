package StriverDSASheet.BasicMaths;

import java.util.Scanner;

public class GCD {

    public static int calcGCD(int n, int m){
        // Using Euclidean's Algo
        //n= 8 , m= 12
        //then, gcd(8,12) = gcd(8,4) = gcd(0,4) i.e. gcd(a,b) = gcd(a,b%a) , where b>a
        //So, now if one of the variable becomes 0 the other one will be the gcd
        //Time Complexity : O(log(min(n,m)))
        while(n>0 && m>0){
            if(n>m)
                n = n%m;
            else
                m = m%n;
        }
        if(n==0)
            return m;
        if(m==0)
            return n;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int gcd = calcGCD(n,m);
        System.out.println(gcd);
    }
}
