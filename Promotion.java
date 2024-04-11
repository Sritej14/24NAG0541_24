
import java.util.Scanner;
class Promotion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter years of service:");
        int yearsOfService = scanner.nextInt();

        System.out.println("Enter performance rating (excellent/good/fair/poor):");
        String performanceRating = scanner.next().toLowerCase();

        System.out.println("Enter number of advanced training programs completed:");
        int trainingProgramsCompleted = scanner.nextInt();

        boolean isEligible = yearsOfService >= 5 && performanceRating.equals("excellent") && trainingProgramsCompleted >= 1;
        if (isEligible) {
            System.out.println("Congratulations! You are eligible for promotion.");
        } else {
            System.out.println("Sorry, you are not eligible for promotion at this time.");
        }

        scanner.close();
    }
}
