package javaassignment1unext;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        System.out.println("========Pattern 2=========");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
