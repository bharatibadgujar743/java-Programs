import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("\nArithmetic Progression:");
        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
            sum += term;
        }

        System.out.println("\n\nSum of AP: " + sum);
    }
}
