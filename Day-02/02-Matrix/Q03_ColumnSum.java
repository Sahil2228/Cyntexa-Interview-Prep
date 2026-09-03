import java.util.Scanner;

public class Q03_ColumnSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive.");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < columns; j++) {

            long sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " sum: " + sum);
        }

        sc.close();
    }
}