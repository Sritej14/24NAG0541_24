import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the no of terms in the Fibonacci sequence: ");
        int num = sc.nextInt();

        int  a= 0, b= 1;

        System.out.println("Fibonacci sequence:");
        System.out.print(a + ", " + b);

        for (int i = 2; i < num; i++) {
            int n= a + b;
            System.out.print(", " + n);
            a = b;
            b= n;
        }

        System.out.println();
    }
}
