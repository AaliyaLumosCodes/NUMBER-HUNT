

import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args ) {
        System.out.println(" WELCOME TO NUMBER HUNT ! ENTER ANY NUMBER FROM 1 TO 10 AND SEE IF YOU GUESSED THE NUMBER CORRECTLY");
Random random = new Random();
Scanner scanner = new Scanner(System.in);
int secret = random.nextInt(10)+1;
int guess = scanner.nextInt();
while(guess != secret){
    System.out.println("INCORRECT! TRY AGAIN.");
    guess = scanner.nextInt();
}
System.out.println(" CONGRATULATIONS! IT'S CORRECT ");


    }

        }