package StriverDSASheet.BasicMaths;

import java.util.Scanner;

public class PrintDivisors {

    public static int sumOfAllDivisors(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + sumOfDivisor(i);
        }
        return sum;
    }

    static int sumOfDivisor(int n){
        int sum = 0;
        if(n==1)
            return 1;
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if((n%i)==0 && (n%(n/i))==0){
               sum = sum + i;
               if((n/i)!=i){
                   sum = sum + (n/i);
               }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter The No.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum = sumOfAllDivisors(n);
        System.out.println(sum);
    }
}
