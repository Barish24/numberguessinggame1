import java.util.Scanner;  
import java.lang.Math;  
public class numberguessinggame{  
  public static void main(String[] args) {  
    int secretNumber = (int)(Math.random() * 100) + 1;  
    int remainingAttempts = 5;  
    Scanner userInput = new Scanner(System.in);  
    boolean isGuessed = false;  
    System.out.println("I'm thinking of a number between 1 and 100.");  
    System.out.println("You have 5 attempts to guess the number.");  
    while (remainingAttempts > 0) {  
      System.out.println("Enter your guess: ");  
      int userGuess = userInput.nextInt();  
      if (userGuess == secretNumber) {  
        System.out.println("Congratulations! You've guessed the number. You win!");  
        isGuessed = true;  
        break;  
      } else if (userGuess > secretNumber) {  
        System.out.println("Your guess is too high. You have " + (remainingAttempts - 1) + " attempts left.");  
      } else {  
        System.out.println("Your guess is too low. You have " + (remainingAttempts - 1) + " attempts left.");  
      }  
      remainingAttempts--;  
    }  
    if (!isGuessed) {  
      System.out.println("You've run out of attempts. You lose!");  
    }  
  }  
}