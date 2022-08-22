import java.util.Random;
import java.util.Scanner;

public class Pro3_64010683 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        if (size >= 1) {
            int[][] matrix = new int[size][size];

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int randomMetrix = rand.nextInt(2);

                    if (j < size - 1) {
                        System.out.printf("%d ", randomMetrix);

                    } else {
                        System.out.printf("%d\n", randomMetrix);

                    }

                    matrix[i][j] = randomMetrix;
                }
            }
            rowCheck(matrix, size);
            columnCheck(matrix, size);
            superDiagonalCheck(matrix, size);
            diagonalCheck(matrix, size);
            subDiagonalCheck(matrix, size);
        } else {
            System.out.println("Size for the matrix must greater than 0");

        }
        input.close();
    }

    public static void rowCheck(int[][] matrix, int size) {
        int count = 0;
        int printCount = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == matrix[i][0]) {
                    count++;
                }
            }
            if (count == size) {
                System.out.printf("All %ds on row %d\n", matrix[i][0], i);
                printCount++;

            }
            count = 0;
        }
        if (printCount == 0) {
            System.out.println("No same numbers on a row");

        }
    }

    public static void columnCheck(int[][] matrix, int size) {
        int count = 0;
        int printCount = 0;
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (matrix[i][j] == matrix[0][j]) {
                    count++;
                }
            }
            if (count == size) {
                System.out.printf("All %ds on column %d\n", matrix[0][j], j);
                printCount++;

            }
            count = 0;
        }
        if (printCount == 0) {
            System.out.println("No same numbers on a column");

        }
    }

    public static void superDiagonalCheck(int[][] matrix, int size) {
        int count = 0;
        int printCount = 0;
        for (int i = 0; i < size - 1; i++) {
            if (matrix[i][i + 1] == matrix[0][1]) {
                count++;
            }

            if (count == size - 1 && size > 2) {
                System.out.printf("All %ds on the superdiagonal\n", matrix[0][1]);
                printCount++;

            }
        }
        if (printCount == 0) {
            System.out.println("No same numbers on the superdiagonal");

        }
    }

    public static void diagonalCheck(int[][] matrix, int size) {
        int count = 0;
        int printCount = 0;
        for (int i = 0; i < size; i++) {
            if (matrix[i][i] == matrix[0][0]) {
                count++;
            }

            if (count == size) {
                System.out.printf("All %ds on the diagonal\n", matrix[0][0]);
                printCount++;

            }
        }
        if (printCount == 0) {
            System.out.println("No same numbers on the diagonal");

        }
    }

    public static void subDiagonalCheck(int[][] matrix, int size) {
        int count = 0;
        int printCount = 0;
        for (int i = 1; i < size; i++) {
            if (matrix[i][i - 1] == matrix[1][0]) {
                count++;
            }

            if (count == size - 1 && size > 2) {
                System.out.printf("All %ds on the subdiagonal\n", matrix[1][0]);
                printCount++;

            }
        }
        if (printCount == 0) {
            System.out.println("No same numbers on the subdiagonal");

        }
    }
}
