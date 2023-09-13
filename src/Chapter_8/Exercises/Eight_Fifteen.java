package Chapter_8.Exercises;

import java.util.Scanner;

public class Eight_Fifteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 points: ");
        double[][] points = new double[5][2];
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        System.out.println("Are they on the same lines? " + sameLine(points));
    }
    //pg 336
    public static boolean sameLine(double[][] points){

        for (int i = 1; i < points.length-1; i++) {
            double slopeFirst = (points[i-1][1] + points[i][1])/(points[i-1][0] + points[i][0]);
            double slopeSecond = (points[i+1][1] + points[i][1])/(points[i+1][0] + points[i][0]);
            if ((slopeFirst != slopeSecond) || !(slopeFirst - slopeSecond < 0.0000000000001)) return false;
        }
        return true;
    }
}
