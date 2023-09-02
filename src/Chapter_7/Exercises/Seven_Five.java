package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Five {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);

        int distinctCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = input.nextInt();

            boolean isDistinct = true;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == number) isDistinct = false;
            }

            if (isDistinct) {
                numbers[i] = number;
                distinctCount++;
            }
        }

        System.out.println("Distinct numbers are : " + distinctCount);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0)System.out.print(numbers[i] + " ");
        }
    }
}
