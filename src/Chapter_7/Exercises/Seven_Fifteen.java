package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Fifteen {

    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] duplicatesRemoved = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are : ");
        for (int i = 0; i < duplicatesRemoved.length; i++) {
            System.out.print(duplicatesRemoved[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] newArray = new int[list.length];
        int counter = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < list.length; j++) {
                if (newArray[j] == list[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                newArray[counter] = list[i];
                counter++;
            }
        }

        int[] anotherNewArray = new int[counter];
        for (int i = 0; i < anotherNewArray.length; i++) {
            anotherNewArray[i] = newArray[i];
        }

        return anotherNewArray;
    }

}
