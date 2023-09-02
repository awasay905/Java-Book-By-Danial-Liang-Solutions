package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Three {

    public static void main(String[] args) {
        System.out.print("Enter integers between 1 and 100 inclusive: ");
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];

        int number = input.nextInt();

        while (number >= 1 && number <= 100){
            numbers[number-1]++;
            number = input.nextInt();
        }
        System.out.println(number + " entered. Closing input");
        System.out.println("----------REPORT----------");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 ) System.out.println((i+1) + " occurred 1 time");
            else if (numbers[i] > 1 ) System.out.println((i+1) + " occurred "+numbers[i] + " times");
        }
    }
}
