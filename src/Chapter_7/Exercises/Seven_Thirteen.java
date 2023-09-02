package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Thirteen {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 15; j++) {
                int random = getRandom(1,100,4,8,95,93);

                System.out.printf("%4d ", random);
            }
            System.out.println();
        }
    }

    public static int getRandom(int start, int end, int ...numbers){
        int random;
        boolean isIncluded;

        do {
            random = (int)(Math.random()*(end-start) + start);
            isIncluded = false;

            for (int i = 0; i < numbers.length; i++) {
                if (random == numbers[i]){
                    isIncluded = true;
                    break;
                }
            }
        } while (isIncluded);
        return random;
    }
}
