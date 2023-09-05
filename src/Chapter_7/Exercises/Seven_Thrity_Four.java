package Chapter_7.Exercises;

public class Seven_Thrity_Four {
    public static void main(String[] args) {
        System.out.println("\"afedkkcllbg\" sorted is " + sort("afedkkcllbg"));
    }

    public static String sort(String s){
        String sorted = "";
        char[] chars = new char[s.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }

        for (int i = 0; i < chars.length; i++) {
            char smallest = chars[i];
            int smallestIndex = i;

            for (int j = i; j < chars.length; j++) {
                if (chars[j] <= smallest){
                    smallest = chars[j];
                    smallestIndex = j;
                }
            }

            char temp = chars[i];
            chars[i] = smallest;
            chars[smallestIndex] = temp;
            sorted += smallest;

        }

        return sorted;
    }
}
