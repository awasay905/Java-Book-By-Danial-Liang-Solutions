package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Twelve {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        int[] ints = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = input.nextInt();
        }
        System.out.print("The reverse array is : ");
        reverse(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
    public static int[] reverse(int[] list){

        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }

        return list;
    }
}
