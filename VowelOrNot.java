package javaassignment1unext;

import java.util.Scanner;

public class VowelOrNot {

    public static void main(String[] args) {
        System.out.println("========Vowel or not=======");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        String s = sc.nextLine();
        switch(s){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(s + " is a vowel character.");
                break;

            default:
                System.out.println(s + " is not a vowel character.");
        }
    }

}
