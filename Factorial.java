package javaassignment1unext;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		System.out.println("=======Factorial======");
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int i,fact=1;  
        int number=scan.nextInt(); 
        for(i=1;i<=number;i++){ 
        	
            fact=fact*i;   
            
        }    
        
        
        System.out.println("Factorial of "+number+" is: "+fact);    
        
        
		
	}

}
