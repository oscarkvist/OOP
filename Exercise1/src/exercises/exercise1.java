package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exercise1 {
    public static void upg1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Compound Interest Calculator");
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the insert rate in percentage: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        for (int i = 1; i <= years; i++) {
            double currentAmount = principal * Math.pow(1 + (rate / 100), i);
            double compoundInterest = currentAmount - principal;
            System.out.printf("Year %d - Current Amount: %.2f, Compound Interest: %.2f%n",
                    i, currentAmount, compoundInterest);
        }
        scanner.close();
    }

    public static void upg2() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        boolean rightAnser = false;
        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I have selected a number between 1 and 100. Try to guess it.");
        while (!rightAnser) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                rightAnser = true;
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again");
                attempts++;
            } else {
                System.out.println("Too low! try again");
                attempts++;
            }
        }
        scanner.close();
        System.out.printf("Congratulations! The number was %d \nYou guessed the number in %d attempts", randomNumber, attempts);
    }

    public static void upg3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int prime = scanner.nextInt();
        boolean isPrime = false;
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (prime % i != 0) {
                isPrime = true;
                break;
            }
        }

        if (isPrime) {
            System.out.printf("%d Is a prime number", prime);
        } else {
            System.out.printf("%d Is a not prime number", prime);
        }
    }

    public static void upg4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grades (U, 3, 4, 5). Enter -1 to finish.\n");
        String grade;
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.printf("Grade %d: ", count + 1);
            grade = scanner.next();
            if (grade.equals("-1")) {
                break;
            }
            if (grade.equalsIgnoreCase("U") || grade.equals("3")
                    || grade.equals("4") || grade.equals("5")) {
                if (grade.equalsIgnoreCase("U")) {
                    count++;
                    continue;
                }
                int grades = Integer.parseInt(grade);
                sum += grades;
                count++;
            } else {
                System.out.print("Invalid grade");
            }
        }
        scanner.close();
        System.out.printf("the grade average is: %d", sum / count);
    }

    public static void upg5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] frekvens = new int[26];
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                int index = c - 'a';
                frekvens[index]++;
            }
        }
        System.out.println("Character frequency:");
        for (int i = 0; i < frekvens.length; i++) {
            if (frekvens[i] > 0) {
                char currentChar = (char) ('a' + i);
                System.out.println(currentChar + ": " + frekvens[i]);
            }
        }
    }

    public static void upg6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstWord = scanner.next().toLowerCase();
        System.out.print("Enter the second string: ");
        String secondWord = scanner.next().toLowerCase();
        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        boolean isAnagram = true;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                isAnagram = false;
                break;
            }
        }
        if (!isAnagram) {
            System.out.println("The string are not anagrams");
        } else {
            System.out.println("The string are anagrams");

        }
    }

    public static void upg6changed() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstWord = scanner.next().toLowerCase();
        System.out.print("Enter the second string: ");
        String secondWord = scanner.next().toLowerCase();
        boolean isAnagram = checkAnagram(firstWord, secondWord);
        if (!isAnagram) {
            System.out.println("The string are not anagrams");
        } else {
            System.out.println("The string are anagrams");
        }
    }

    private static boolean checkAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void upg7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Swedish social security number(In the form YYMMDD-XXXX): ");
        String personalNumber = scanner.next().replace("-", "");
        scanner.close();
        if (validSSN(personalNumber)) {
            System.out.println("Valid social security number.");
            System.out.println("Sex: " + isFemale(personalNumber.charAt(8)));
        } else {
            System.out.println("Not a valid social security number.");

        }


    }

    private static boolean validSSN(String personalNumber) {
        if (personalNumber.length() != 10) {
            return false;
        }
        for (char c : personalNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        int lastDigit = Character.getNumericValue(personalNumber.charAt(9));
        int calculatedLastDigit = calculateLastDigit(personalNumber.substring(0, 9));
        return lastDigit == calculatedLastDigit;
    }

    private static int calculateLastDigit(String ssnPart) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(ssnPart.charAt(i));
            if (i % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }
        return (10 - (sum % 10)) % 10;
    }

    private static String isFemale (int thirdDigit){
        if (thirdDigit % 2 == 0) {
            return "Female";
        } else {
            return "Male";
        }
    }
}
