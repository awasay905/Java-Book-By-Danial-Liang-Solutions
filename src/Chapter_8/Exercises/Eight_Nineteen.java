package Chapter_8.Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Eight_Nineteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int m = input.nextInt();
        int n = input.nextInt();

        System.out.println("Enter the conects of the matrix");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Is there any patterns? " + (isConsecutiveFour(matrix)? "Yes" : "No"));

    }

    public static boolean isConsecutiveFour(int[][] values){

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                boolean isSame = true;

                //checks horizontally
                if (j <= values[i].length -4) {
                    for (int k = j; k < j + 4 - 1; k++) {
                        if (values[i][k] != values[i][k + 1]) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) return true;
                    else isSame = true;
                }

                //checks vertically
                if (i <=values.length-4 ) {
                    for (int k = i; k < i + 4 - 1; k++) {
                        if (values[k][j] != values[k + 1][j]) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) return true;
                    else isSame = true;
                }

                //checks right diagonally
                if (i <= values.length - 4 && j <= values[i].length - 4) {
                    for (int k = 0; k < 3; k++) {
                        if (values[i+k][j+k] != values[i+k + 1][j+k + 1]) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) return true;
                }
                //checks left diagonally
                if (i < values.length -3 && j >=3) {
                    for (int k = 0; k < 3; k++) {

                            if (values[i+k][j-k] != values[i+k+1][j-k-1]) {
                            isSame = false;
                            break;

                        }
                    }
                    if (isSame) return true;
                }
            }
        }


        return false;
    }
}
