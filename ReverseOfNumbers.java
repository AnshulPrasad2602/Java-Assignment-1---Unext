package javaassignment1unext;

import java.util.Scanner;

public class ReverseOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("=======Reverse of a Number=======");
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = scan.nextInt();

        int reverse = 0;

        while(n > 0){

                        int temp = n%10;

                        reverse = reverse * 10 + temp; 

                        n = n/10;

        }

        System.out.println("The reverse is " + reverse);

	}

}
