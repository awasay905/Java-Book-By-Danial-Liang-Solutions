package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Eight {

    public static void main(String[] args) {
        System.out.print("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        int[] integers = new int[10];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt();
        }

        System.out.println("The average is " + average(integers));

        System.out.println("Now, ");
        System.out.print("Enter 10 doubles: ");
        double[] doubles = new double[10];

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = input.nextInt();
        }

        System.out.println("The average is " + average(doubles));
    }

    public static double average(int[] array){
        if (array.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/ (double)array.length;
    }

    public static double average(double[] array){
        if (array.length == 0) return 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/ array.length;
    }
}
