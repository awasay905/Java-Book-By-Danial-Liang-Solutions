package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Thirty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }



        System.out.println("The list has" + (isConsecutiveFour(list) ? " " : " no ") + "consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] values){
        if (values.length < 4) return false;

        for (int i = 0; i < values.length-4; i++) {
            if ((values[i] == values [i+1]) &&
            (values[i+1] == values[i+2] )&&
           ( values[i+2] == values[i+3] )) return true;
        }
        return false;
    }
}
