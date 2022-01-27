package javaassignment1unext;

import java.util.Scanner;

public class GreatestOfThreeNumber {

    public static void main(String[] args) {
        System.out.println("========Greatest of three numbers=======");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        if (a>=b && a>=c){
            System.out.println(a + " is largest.");
        }
        else if (b>=a && b>=c){
            System.out.println(b + " is largest.");
        }
        else{
            System.out.println(c + " is largest.");
        }
    }

}
