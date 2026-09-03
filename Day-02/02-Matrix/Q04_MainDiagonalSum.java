import java.util.Scanner;

public class Q04_MainDiagonalSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size must be positive.");
            sc.close();
            return;
        }

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Main diagonal sum: " + sum);

        sc.close();
    }
}