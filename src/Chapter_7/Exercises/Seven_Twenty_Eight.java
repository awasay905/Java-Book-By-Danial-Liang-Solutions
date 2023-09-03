package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Twenty_Eight {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Possible combinations of picking two numbers are: ");

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.println(numbers[i] + ", " + numbers[j]);
            }
        }
    }
}
