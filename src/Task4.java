import java.util.Objects;
import java.util.Scanner;

public class Task4 {

    public static void Word(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");

        //read;

        String read = scanner.next();

        System.out.println("Your word is: " + read);

        String reverse = new StringBuilder(read).reverse().toString();

        System.out.println("Your reverse is: " + reverse);


        if (read == reverse);
        boolean res =  read.equals(reverse);
        System.out.printf("You entered palindrome? Answer: " + String.valueOf(res));
    }
}
