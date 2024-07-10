import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();
boolean playAgain;
do {
int numberToGuess = random.nextInt(100) + 1;
int numberOfAttempts = 0;
int guess;
 boolean hasGuessedCorrectly = false;
System.out.println( "choose a number between 1 and 100. and guess it?");
 while (!hasGuessedCorrectly && numberOfAttempts < 10) 
{ 
 System.out.print("Enter your guess: ");
guess = scanner.nextInt();
numberOfAttempts++;
if (guess < numberToGuess) 
{
System.out.println("Too low! Try again.");
}
 else if (guess > numberToGuess)
{
System.out.println("Too high! Try again.");
}
else
{
 System.out.println("Correct!  guessed number is in " + numberOfAttempts + " attempts.");
 hasGuessedCorrectly = true;
}
}
 if (!hasGuessedCorrectly) 
{
System.out.println("loss of all  10 attempts. The number was " + numberToGuess);
}
System.out.print("Do you want to play again? (yes/no): ");
 playAgain = scanner.next().equalsIgnoreCase("yes");
 } while (playAgain);
 System.out.println("Thank you for playing the Game!");
        scanner.close();
}
}
