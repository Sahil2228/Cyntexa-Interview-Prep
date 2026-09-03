import java.util.Scanner;

public class Q12_SnakeMatrix {
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

        int number = 1;

        for (int i = 0; i < rows; i++) {

            if (i % 2 == 0) {

                // Left → Right
                for (int j = 0; j < columns; j++) {
                    System.out.print(number + " ");
                    number++;
                }

            } else {

                // Right → Left
                int start = number + columns - 1;

                for (int j = 0; j < columns; j++) {
                    System.out.print(start + " ");
                    start--;
                }

                number += columns;
            }

            System.out.println();
        }

        sc.close();
    }
}

// 1  2  3
// 6  5  4
// 7  8  9