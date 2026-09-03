import java.util.Scanner;

public class Q12_NumberStarPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of rows must be positive.");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j % 2 == 1) {
                    System.out.print((j + 1) / 2 + " ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
// 1
// 1 *
// 1 * 2
// 1 * 2 *
// 1 * 2 * 3