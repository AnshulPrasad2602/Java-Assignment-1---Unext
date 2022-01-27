package javaassignment1unext;

import java.util.Scanner;

public class PrimeNumbers {
	
	private static Scanner scan;

    public static void main(String[] args) {
    	
    	System.out.println("==========Prime Numbers===========");

                    scan = new Scanner(System.in);

                    System.out.println("Enter a number: ");

                    int n = scan.nextInt();

                   

                    System.out.println("The prime numbers in range 2 and " + n + " are ");

                   

                    for(int j = 2; j < n; j++)

                    {             

                                    int count = 0;

                                    for(int i = 2; i <= j/2; i++){

                                                    if(j%i == 0){

                                                                    count++;

                                                                    break;

                                                    }

                                    }

                                   

                                    if(count == 0){

                                                    System.out.print(j + " ");

                                    }

                    }

    }

}
