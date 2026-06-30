import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            Random rand = new Random();
            int rollNumber = 0;
            int die1, die2, die3;

            System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("------------------------------------------");

            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                rollNumber++;

                System.out.printf("%-8d%-8d%-8d%-8d%-8d%n", rollNumber, die1, die2, die3, sum);

            } while (die1 != die2 || die2 != die3);

            System.out.println("Triple rolled after " + rollNumber + " roll(s)!");
            System.out.print("Roll again? (y/n): ");
            again = scanner.nextLine().trim();

        } while (again.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}