import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        String animal = "Cat";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean noMoreGuess = false;

        while (!guess.equals(animal) && !noMoreGuess) {

            if (guessCount < guessLimit) {
                System.out.println("Guess the animal: ");
                guess = Input.nextLine();
                guessCount++;
            } else {
                noMoreGuess = true;
            }
        } if(noMoreGuess) {
            System.out.println("You're out of guesses!");
        } else {
            System.out.println("You guessed correctly!");
            }
    }
}