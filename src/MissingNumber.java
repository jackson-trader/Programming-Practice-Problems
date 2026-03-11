/* You are given all numbers between 1...n except one. Your task is to find the missing number. */
/* Always look at constraints when solving programming problems */
/* sum([1,...,n]) = (n+1)n/2

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] allNumbers = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            allNumbers[i] = in.nextInt();
        }


    }
}
