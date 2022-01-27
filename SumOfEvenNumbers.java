package javaassignment1unext;

import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        System.out.println("=========Sum of even numbers========");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0){
                sum += i;
            }
        }
        System.out.println("Sum of even number from 1 to " + n+ " is " + sum);
    }

}
