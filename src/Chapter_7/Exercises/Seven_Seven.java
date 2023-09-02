package Chapter_7.Exercises;

public class Seven_Seven {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 0; i < 100; i++) {
            counts[(int)(Math.random()*10)]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println("Number " + i + " occurred " + counts[i] + " times.");
        }
    }
}
