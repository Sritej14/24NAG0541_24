import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voting Eligibility Checker");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume newline character

        System.out.print("Are you a citizen of the country? (yes/no): ");
        String citizenshipStatus = scanner.nextLine().toLowerCase();

        System.out.print("Have you committed any felony? (yes/no): ");
        String felonyStatus = scanner.nextLine().toLowerCase();

        // Check eligibility based on age, citizenship, and felony status
        if (age >= 18 && citizenshipStatus.equals("yes") && felonyStatus.equals("no")) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
