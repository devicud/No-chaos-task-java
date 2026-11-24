import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int constant_number = 50;
        int trials = 10;

        while (trials > 0) {
            System.out.print("Guess a number from 1 to 100: ");
            int number = input.nextInt();

            if (number == constant_number) {
                System.out.println("Congratulations");
                trials = 0;
            } else {
                trials -= 1;
                System.out.println("Wrong guess");
                System.out.println("attempts left:  " + trials);
            }
        }
    }
}
