package javaassignment1unext;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        System.out.println("========Pattern 1=========");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

}
