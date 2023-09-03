package Chapter_7.Exercises;

import java.util.Arrays;

public class Seven_Twenty_Three {

    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int i = 1; i <= 100; i++) {  //students 1 to 100

            for (int j = i; j <=100; j+=i) {
                lockers[j-1] = !lockers[j-1];
            }
        }

        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) System.out.print((i+1) + " ");
        }
    }
}
