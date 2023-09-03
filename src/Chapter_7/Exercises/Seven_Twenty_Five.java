package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Twenty_Five {

    public static void main(String[] args) {
        System.out.print("Write the coefficients of x^2, x, and constant for quadratic equations: ");
        double[] eqn = new double[3];
        double[] roots = new double[2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextInt();
        }

        System.out.println("Number of real roots are " + solveQuadratic(eqn, roots));
        System.out.println("Real roots are: ");
        for (int i = 0; i < roots.length; i++) {
            System.out.print(roots[i] + " ");
        }
    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double determinant = eqn[1]*eqn[1] - 4*eqn[0]*eqn[2];
        if (determinant < 0) {
            return 0;
        };
        if (determinant > 0){
            double root1 = (-eqn[1] + Math.sqrt(determinant))/(2*eqn[0]);
            double root2 = (-eqn[1] - Math.sqrt(determinant))/(2*eqn[0]);
            roots[0] = root1;
            roots[1] = root2;
            return 2;
        }
        else {
            roots[0] = roots[1] = -eqn[1] / (2/eqn[0]);
            return 1;
        }
    }
}
