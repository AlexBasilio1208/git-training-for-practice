import java.util.Scanner;
public class GuessTheWord {
    public static void main(String[] args) {
        /*
        General Instructions:
        1. By default, there was a saved secret word.
        2. You have 5 attempts to guess the correct word.
        3. Once guessed, the game ends.
        4. No hint is available only the number of letters.
         */

        //welcome message
        System.out.println("Welcome to Guess the Word Game!");

        //declare a secret word
        String secretWord = "java";
        Scanner guessedWord = new Scanner(System.in);
        boolean isWinner = false; // to have a game over message if 5 attempts were unsuccessful

        //loop for 5 attempts
        for (int attempts = 5; attempts >= 1; attempts--) {
            System.out.print("You have " + attempts + " number of attempts remaining. \n");
            String word = guessedWord.nextLine();

            //conditionals for the winning moment
            if (word.equals(secretWord)) {
                System.out.println("You have guessed the right word!");
                isWinner = true;
                break;
            } else {
                System.out.println("Incorrect!");
            }
        }
            //if there are no more attempts
            if (!isWinner){
                System.out.println("No more attempts. The secret word is " + secretWord);
            }

            guessedWord.close();


    }
}