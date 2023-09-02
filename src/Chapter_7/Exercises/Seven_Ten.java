package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Ten {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        double[] doubles = new double[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = input.nextDouble();
        }
        System.out.println("The minimum number index is " + indexOfSmallestElement(doubles));
    }

    public static int indexOfSmallestElement(double[] array){
        if (array.length == 0) return 0;
        double min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
}
