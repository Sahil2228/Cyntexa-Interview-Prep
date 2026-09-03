import java.util.Scanner;

public class Q09_DiagonalTraversal {
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

        System.out.println("Diagonal Traversal:");

        for (int diagonal = 0; diagonal < rows + columns - 1; diagonal++) {

            int row = diagonal < columns ? 0 : diagonal - columns + 1;
            int column = diagonal < columns ? diagonal : columns - 1;

            while (row < rows && column >= 0) {
                System.out.print(matrix[row][column] + " ");
                row++;
                column--;
            }
        }

        sc.close();
    }
}