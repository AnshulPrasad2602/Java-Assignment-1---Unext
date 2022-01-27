package javaassignment1unext;

public class OddNumbers {

    public static void main(String[] args) {
        System.out.println("========Odd number till 100=======");
        int i = 50;
        while(i <= 100){
            if (i%2 != 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }

}
