import java.util.Scanner;

public class Q13_FibonacciTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of rows must be positive.");
            sc.close();
            return;
        }

        long first = 0;
        long second = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(first + " ");

                long next = first + second;
                first = second;
                second = next;
            }

            System.out.println();
        }

        sc.close();
    }
}
// 0
// 1 1
// 2 3 5
// 8 13 21 34
// 55 89 144 233 377