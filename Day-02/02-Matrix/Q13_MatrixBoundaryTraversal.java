import java.util.Scanner;

public class Q13_MatrixBoundaryTraversal {
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

        System.out.println("Boundary Traversal:");

        // Single row
        if (rows == 1) {

            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[0][j] + " ");
            }

        // Single column
        } else if (columns == 1) {

            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][0] + " ");
            }

        } else {

            // Top row: Left → Right
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[0][j] + " ");
            }

            // Right column: Top → Bottom
            for (int i = 1; i < rows; i++) {
                System.out.print(matrix[i][columns - 1] + " ");
            }

            // Bottom row: Right → Left
            for (int j = columns - 2; j >= 0; j--) {
                System.out.print(matrix[rows - 1][j] + " ");
            }

            // Left column: Bottom → Top
            for (int i = rows - 2; i >= 1; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }

        sc.close();
    }
}

// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// Boundary:
// 1 2 3 4 8 12 11 10 9 5