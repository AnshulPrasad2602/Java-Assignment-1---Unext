package javaassignment1unext;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		System.out.println("=======Array Reverse======");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 1; i <= n; i++){

                        arr[i-1] = i;

        }

       

        int[] arr1 = new int[n];

        for(int i = 0, j = n-1; i < n; i++, j--){

                        arr1[i] = arr[j];

        }

       

        System.out.println("Original Array");

        for(int i: arr){

                        System.out.print(i + " ");

        }

        System.out.println("");

        System.out.println("Reverse Array");

        for(int i: arr1){

                        System.out.print(i + " ");

        }
	}

}
