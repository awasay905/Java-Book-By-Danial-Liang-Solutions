package Chapter_8.Exercises;
import java.util.Arrays;

public class Eight_Sixteen {

    public static void main(String[] args) {
        int[][] array = {
                {4,2},
                {1,7},
                {4,5},
                {1,2},
                {1,1},
                {4, 1}
        };
        sort(array);
        System.out.println(Arrays.deepToString(array));
    }

    public static void sort(int m[][]){

        //First sort the rows. N3 big 0
        for (int i = 0; i < m.length; i++) {
            int[] array = m[i];

            for (int j = 0; j < array.length-1; j++) {
                int smallest = array[j];
                int smallestIndex = j;

                for (int k = j+1; k < array.length; k++) {
                    if (array[k] < smallest){
                        smallest = array[k];
                        smallestIndex = k;
                    }
                }

                if (smallestIndex != j){
                    //swap
                    int temp = array[j];
                    array[j] = smallest;
                    array[smallestIndex] = temp;
                }
            }
        }

        //now sort on columns
        for (int i = 0; i < m.length - 1; i++) {
            boolean compareNext = true;
            for (int j = 0; j < m[i].length; j++) {
                int[] smallest = m[i];
                int smallestIndex =i;
                for (int k = i+1; k < m.length; k++) {
                    //only do this when previous values are equal
                    //but how?
                    //maybe run loop from 0 till j to check
                    boolean previousSame = true;
                    for (int l = 0; l < j; l++) {
                        if (m[k][l] != smallest[l]) previousSame = false;
                    }
                    if (previousSame && m[k][j] < smallest[j]){
                        smallest = m[k];
                        smallestIndex = k;
                    }
                }

                if (smallestIndex != i){
                    int[] temp = m[i];
                    m[i] = smallest;
                    m[smallestIndex] = temp;
                }
            }

        }
    }
}
