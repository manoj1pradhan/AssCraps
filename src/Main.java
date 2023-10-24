import java.util.Random;
import java.util.Scanner;
 class CrapsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int sum = dice1 + dice2;

            System.out.println("Rolling...");
            System.out.println("Die 1: " + dice1);
            System.out.println("Die 2: " + dice2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps!");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural!");
            } else {
                System.out.println("Point is now " + sum);
                System.out.println("Trying or point...");

                int point;
                do {
                    int newDice1 = random.nextInt(6) + 1;
                    int newDice2 = random.nextInt(6) + 1;
                    int newSum = newDice1 + newDice2;

                    System.out.println("Rolling the dice...");
                    System.out.println("Die 1: " + newDice1);
                    System.out.println("Die 2: " + newDice2);
                    System.out.println("Sum: " + newSum);

                    if (newSum == sum) {
                        System.out.println("Made the point! You win.");
                        break;
                    } else if (newSum == 7) {
                        System.out.println("Got a seven! You lose.");
                        break;
                    }
                } while (true);
            }

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
