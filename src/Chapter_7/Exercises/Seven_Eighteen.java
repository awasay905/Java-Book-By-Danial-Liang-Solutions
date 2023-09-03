package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Eighteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("j");

    }

    public static int[] bubbleSort(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[1+j];
                    array[j+1] = temp;
                }
            }

        }
        return array;
    }


}
