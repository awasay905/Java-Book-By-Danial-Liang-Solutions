package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Twenty {

    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        revisedSelectionSort(numbers);

        System.out.print("The sorted array is : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int[] revisedSelectionSort(int[] list){
        if (list.length <= 1) return list;

        for (int i = list.length-1; i >=0; i--) {
            int currentBiggest=list[i];
            int currentBiggestIndex = i;

            for (int j = i; j >=0 ; j--) {
                if (list[j] > currentBiggest){
                    currentBiggest = list[j];
                    currentBiggestIndex = j;
                }
            }

            if (currentBiggestIndex != i){
                int temp = list[i];
                list[i] = currentBiggest;
                list[currentBiggestIndex] = temp;
            }
        }
        return list;
    }
}
