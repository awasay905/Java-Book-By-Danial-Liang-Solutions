package Chapter_7.Exercises;

public class Seven_Twenty_Two {

    public static void main(String[] args) {
        int numOfUppercaseChar = 0;

        for (int i = 0; i < args[0].length(); i++) {
            if (args[0].charAt(i) >= 'A' && args[0].charAt(i) <= 'Z') numOfUppercaseChar++;
        }

        System.out.println("Number of uppercase character in string \"" + args[0] + "\" is " + numOfUppercaseChar);
    }
}
