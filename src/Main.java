import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class Main {
    public static void main(String[] args) {
        upg2();
    }

    public static void upg1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Compound Interest Calculator");
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the insert rate in percentage: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        for (int i = 1; i <= years; i++){
            double currentAmount = principal*Math.pow(1+(rate/100), i);
            double compoundInterest = currentAmount - principal;
            System.out.printf("Year %d - Current Amount: %.2f, Compound Interest: %.2f%n",
                    i, currentAmount, compoundInterest);
            }
            scanner.close();
    }

    public static void upg2(){
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        boolean rightAnser = false;
        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I have selected a number between 1 and 100. Try to guess it.");
        while (!rightAnser){
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            if (guess == randomNumber){
                rightAnser = true;
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again");
                attempts++;
            }
else {
 System.out.println("Too low! try again");
 attempts++;
            }
        }
System.out.printf("Congratulations! The number was %d \nYou guessed the number in %d attempts",randomNumber,attempts);
    }

}

