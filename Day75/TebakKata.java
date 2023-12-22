package Day75;

import java.util.Scanner;

public class TebakKata {
    public static void main(String[] args) {
        // Generate random word
        String word = "java";

        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Get the user's guess
        String guess = "";
        while (guess != word) {
            System.out.print("Guess the word: ");
            guess = scanner.nextLine();

            // Check if the guess is correct
            if (guess.equals(word)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The word is: " + word);
            }
        }
    }
  
}