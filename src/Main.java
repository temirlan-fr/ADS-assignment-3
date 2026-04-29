import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenTarget = random.nextInt(101);

        Scanner guessNum = new Scanner(System.in);
        int num;
        int attempts = 0;
        int sum = 0;

        do {
            num = guessNum.nextInt();

            if (num < hiddenTarget) {
                System.out.println("No, hidden target is bigger than this number");
            } else if (num > hiddenTarget) {
                System.out.println("No, hidden target is less than this number");
            }

            attempts++;
            sum += num;

        } while (num != hiddenTarget);

        double avg = sum / attempts;

        System.out.println("Correct, the target number is: " + hiddenTarget);
        System.out.println("The average of attempts: " + avg);
    }

}