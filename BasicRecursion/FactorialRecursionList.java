package StriverDSASheet.BasicRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorialRecursionList {
    public static List<Long> factorialNumbers(long n) {
        // Recursion Approach
        ArrayList<Long> arrList = new ArrayList<>();
        long fact = 1;
        int i = 2;
        returnFact(n, arrList, fact, i);
        return arrList;
    }
    public static void returnFact(Long n, List<Long> arrList, Long fact, int i)
    {
        if(fact>n)
            return;
        arrList.add(fact);
        returnFact(n, arrList, fact*i, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        long n = sc.nextInt();
        List<Long> factList = factorialNumbers(n);
        for(Long e:factList){
            System.out.print(e+" ");
        }
    }
}
