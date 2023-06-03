import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Byl jsem zde!");
        System.out.println("Já taky!");

        // Vytvoř funkci která bude sčítat 2 čísla a vypíše jejich funkci

        // Todo: Vytvoř funkci která bude sčítat 2 čísla a vypíše jejich funkci (pro martina)
        sum();

    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        int sumValue = 0;
        // Prompt the user to enter the first value
        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();

        // Prompt the user to enter the second value
        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();

        System.out.println("First value: " + firstValue);
        System.out.println("Second value: " + secondValue);
        sumValue = firstValue + secondValue;
        // Print the values to the console
        System.out.println("Sum: " + sumValue);

        // Close the scanner
        scanner.close();
    }
}