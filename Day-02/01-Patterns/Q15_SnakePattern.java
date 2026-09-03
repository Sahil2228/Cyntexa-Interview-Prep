import java.util.Scanner;

public class Q15_SnakePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of rows must be positive.");
            sc.close();
            return;
        }

        int number = 1;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                // Left to right
                for (int j = 1; j <= n; j++) {
                    System.out.print(number + " ");
                    number++;
                }
            } else {
                // Right to left
                int start = number + n - 1;

                for (int j = 1; j <= n; j++) {
                    System.out.print(start + " ");
                    start--;
                }

                number += n;
            }

            System.out.println();
        }

        sc.close();
    }
}

// 1  2  3  4  5
// 10 9  8  7  6
// 11 12 13 14 15
// 20 19 18 17 16
// 21 22 23 24 25