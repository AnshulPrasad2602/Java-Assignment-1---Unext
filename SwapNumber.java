package javaassignment1unext;

import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        System.out.println("========Swap Numbers=======");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Number before swapping, a = " + a + ", b = " + b);
        swap(a,b);

    }

    static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b =temp;
        System.out.println("Number after swapping, a = " + a + ", b = " + b);
    }
}
