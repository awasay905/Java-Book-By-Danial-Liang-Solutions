package Chapter_7.Exercises;

public class Seven_Thrity_Four {
    public static void main(String[] args) {
        System.out.println("\"aksdc\" sorted is " + sort("gfedkkcllba"));
    }

    public static String sort(String s){
        String sorted = "";
        char[] chars = new char[s.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }

        for (int i = 0; i < chars.length-1; i++) {
            char smallest = chars[i];
            int smallestIndex = i;

            for (int j = i; j < chars.length; j++) {
                if (chars[j] <= chars[i]){
                    smallest = chars[j];
                    smallestIndex = j;
                }
            }

            char temp = chars[i];
            chars[i] = smallest;
            chars[smallestIndex] = temp;


            for (int i1 = 0; i1 < chars.length; i1++) {
                System.out.print(chars[i1]+" ");
            }
            System.out.println();
        }

        return sorted;
    }
}
