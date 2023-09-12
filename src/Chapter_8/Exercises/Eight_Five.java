package Chapter_8.Exercises;

import java.util.Scanner;

public class Eight_Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Enter a 3x3 matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter a 3x3 matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] sum = addMatrix(matrix1, matrix2);

        System.out.println("The matrix are added as follows");

        System.out.printf("%4.1f %4.1f %4.1f \t\t %4.1f %4.1f %4.1f \t\t %4.1f %4.1f %4.1f\n",
                matrix1[0][0], matrix1[0][1], matrix1[0][2],
                matrix2[0][0], matrix2[0][1], matrix2[0][2],
                sum[0][0], sum[0][1], sum[0][2]);
        System.out.printf("%4.1f %4.1f %4.1f \t+\t %4.1f %4.1f %4.1f \t=\t %4.1f %4.1f %4.1f\n",
                matrix1[1][0], matrix1[1][1], matrix1[1][2],
                matrix2[1][0], matrix2[1][1], matrix2[1][2],
                sum[1][0], sum[1][1], sum[1][2]);
        System.out.printf("%4.1f %4.1f %4.1f \t\t %4.1f %4.1f %4.1f \t\t %4.1f %4.1f %4.1f",
                matrix1[2][0], matrix1[2][1], matrix1[2][2],
                matrix2[2][0], matrix2[2][1], matrix2[2][2],
                sum[2][0], sum[2][1], sum[2][2]);

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {

        double[][] sum = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
