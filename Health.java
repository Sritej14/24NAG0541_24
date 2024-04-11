import java.util.Scanner;
class Health {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Do you have any pre-existing medical conditions? (yes/no)");
        String medicalConditionStatus = scanner.next().toLowerCase();
        System.out.println("Have you had any hospitalizations within the last 6 months? (yes/no)");
        String hospitalizationStatus = scanner.next().toLowerCase();
        boolean isEligible = age >= 18 && age <= 65 && medicalConditionStatus.equals("no") && hospitalizationStatus.equals("no");
        if (isEligible) {
            System.out.println("Congratulations! You are eligible for the health insurance plan.");
        } else {
            System.out.println("Sorry, you are not eligible for the health insurance plan at this time.");
        }

        scanner.close();
    }
}
