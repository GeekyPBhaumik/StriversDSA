package StriverDSASheet.BasicMaths;

import java.util.Scanner;

public class ReverseBits {
    public static long reverseBits(long n){
        if(n==0)
            return 0;
        //So converting the Long to it's binary representation
        //Then converting into a String
        //Suppose n = "12"
        //So, s = "1100"
        String s = Long.toBinaryString(n);
        //Storing in a StringBuffer to perform the reverse operation later
        StringBuffer sb = new StringBuffer(s);
        //Adding trailing zeroes to it
        //If we don't add trailing zeroes before reversing we will get output as
        //0011	i.e. 3
        //So add trailing zeroes like 00000000000000000000000000001100
        while(sb.length()<32){
            sb.insert(0,"0");
        }
        //Reverse it
        sb.reverse();
        //Now we could have just convert the String to Long
        //But here we need to mention 2 as the string we are trying to convert is in
        //decimal format
        //If it was in base 10 decimal format like "9" the string, there was no need of mentioning
        //radix as 2
        Long revNum = Long.parseLong(sb.toString(),2);
        return revNum;
    }
    public static void main(String[] args) {
        System.out.println("Enter The No.");
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long count = reverseBits(n);
        System.out.println(count);
    }
}
