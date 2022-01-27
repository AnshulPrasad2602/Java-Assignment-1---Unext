package javaassignment1unext;

public class EvenNumbers {

    public static void main(String[] args) {
        System.out.println("========Even number till 50=======");
        int i = 1;
        while(i <= 50){
            if (i%2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }

}
