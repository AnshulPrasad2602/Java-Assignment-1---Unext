package javaassignment1unext;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("======Even or Odd======");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        if (a%2 == 0) {
            System.out.println(a+ " is even number.");
        }
        else{
            System.out.println(a + " is odd number.");
        }
    }

}
