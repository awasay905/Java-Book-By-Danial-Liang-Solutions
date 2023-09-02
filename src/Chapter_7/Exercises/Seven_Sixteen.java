package Chapter_7.Exercises;

import Chapter_7.LinearSearch;

public class Seven_Sixteen {
    public static void main(String[] args) {
        int[] randomArray = new int[Integer.MAX_VALUE];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*100_000);
        }

        long startTime = System.nanoTime();
        int index = LinearSearch.linearSearch(randomArray, 10);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Time taken for linear search was " + executionTime/(double)1000000000);

    }

}
