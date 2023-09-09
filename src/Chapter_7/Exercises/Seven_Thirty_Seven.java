package Chapter_7.Exercises;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Seven_Thirty_Seven {

    public static void main(String[] args) {
        Random random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of slots: ");
        int numOfSlots = input.nextInt();
        int[] slots = new int[numOfSlots];
        System.out.print("Enter the number of balls: ");
        int balls = input.nextInt();


        for (int i = 0; i < balls; i++) {
            int position = 0;
            for (int j = 0; j < numOfSlots; j++) {
                if (random.nextBoolean()){
                    position++;
                    System.out.print("R ");
                } else {
                    System.out.print("L ");
                }
            }
            System.out.println();
            slots[position]++;
        }

        int max=0;
        for (int slot : slots) {
            if (slot > max) {
                max = slot;
            }
        }

        System.out.println();
        for (int i = max; i >= 0; i--) {

            for (int j = 0; j < slots.length; j++) {
                if (slots[j] == i){
                    System.out.print("0");
                    slots[j]--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
