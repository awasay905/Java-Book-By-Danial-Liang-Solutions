package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Thirty_Three {

    public static void main(String[] args) {
        String[] animals = {
                "monkey",
                "rooster",
                "dog",
                "pig",
                "rat",
                "ox",
                "tiger",
                "rabbit",
                "dragon",
                "snake",
                "horse",
                "sheep"
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.println(animals[year%12]);

    }
}
