package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Eleven {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        double[] doubles = new double[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = input.nextDouble();
        }
        System.out.println("The mean is " + mean(doubles));
        System.out.println("The standard deviation is " + deviation(doubles));
    }
    public static double mean(double[] x){
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum/x.length;
    }

    public static double deviation(double[] x){
        double sum = 0;
        double mean = mean(x);
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i]-mean, 2);
        }

        return Math.sqrt(sum/(x.length -1));
    }
}
