

import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args ) {
        System.out.println(" WELCOME TO NUMBER HUNT ! ENTER ANY NUMBER FROM 1 TO 50 AND SEE IF YOU GUESSED THE NUMBER CORRECTLY");
Random random = new Random();
Scanner scanner = new Scanner(System.in);
int secret = random.nextInt(50)+1;
int guess = scanner.nextInt();
        int attempts=1;
while(guess != secret){
    if (guess>secret){
        System.out.println("IT'S A SMALLER NUMBER!");
    }
    else{
        System.out.println("IT'S A BIGGER NUMBER!");
    }
    guess = scanner.nextInt();
    attempts++;
}
System.out.println(" CONGRATULATIONS! IT'S CORRECT. YOU GOT IT IN "+ attempts +" ATTEMPTS. GOOD JOB!");


    }

        }