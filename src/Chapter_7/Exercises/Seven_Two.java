package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers : ");
        int[] integers = new int[10];

        for (int i = 0; i < integers.length; i++) {
            integers[i] =input.nextInt();
        }

        System.out.print("The integers in reverse order are: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[integers.length-1-i] + " ");
        }
    }
}
