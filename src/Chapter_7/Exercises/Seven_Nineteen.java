package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Nineteen {

    public static boolean isSorted(int[] list) {
        if (list.length <= 1) return true;

        for (int i = 1; i < list.length; i++) {
            if (list[i - 1] > list[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the list: ");
        Scanner input = new Scanner(System.in);
        int sizeOfList = input.nextInt();
        int[] list = new int[sizeOfList];

        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < sizeOfList; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("The list has " + sizeOfList + " integers: ");
        for (int i = 0; i < sizeOfList; i++) {
            System.out.print(list[i] + " ");
        }
        if (isSorted(list)) System.out.print("\nThe list is already sorted");
        else System.out.println("\nThe list not sorted");
    }

}
