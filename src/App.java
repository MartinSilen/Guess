import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random rnd = new Random();
        int Answer = rnd.nextInt(9) + 1;
        Scanner com = new Scanner(System.in);
        while (true) {
            System.out.println("Guess the number from 1 to 10:");
            int inp = com.nextInt();
            if (inp == Answer) {
                System.out.println("That's Right!");
                break;
            } else System.out.println("Nope, try again");
        }


    }
}
