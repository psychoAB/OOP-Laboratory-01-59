import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int solution = random.nextInt(100) + 1;
        int answer = 0;
        int round = 0;

        do {
            round += 1;
            System.out.println("Round " + round);
            answer = scanner.nextInt();
            if (solution == answer) {
                if (round < 5) {
                    System.out.println("Correct, excellent.");
                } else {
                    System.out.println("Correct.");
                }
            }
            else if (answer > solution) { 
                System.out.println("Too high.");
            } else {
                System.out.println("Too low.");
            }
        } while (answer != solution);
    }
}
