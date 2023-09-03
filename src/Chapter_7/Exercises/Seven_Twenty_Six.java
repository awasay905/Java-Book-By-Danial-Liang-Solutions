package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Twenty_Six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int list1Size = input.nextInt();
        int[] list1 = new int[list1Size];
        for (int i = 0; i < list1Size; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int list2Size = input.nextInt();
        int[] list2 = new int[list2Size];
        for (int i = 0; i < list2Size; i++) {
            list2[i] = input.nextInt();
        }

        System.out.println("Two lists are" + (equals(list1, list2) ? " " : " not ") + "strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) return false;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) return false;
        }
        return true;
    }
}
