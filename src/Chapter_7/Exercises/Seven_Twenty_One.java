package Chapter_7.Exercises;

public class Seven_Twenty_One {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("The average is " + sum/(double)args.length);
    }
}
