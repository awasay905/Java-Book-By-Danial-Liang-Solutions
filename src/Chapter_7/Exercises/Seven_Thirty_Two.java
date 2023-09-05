package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Thirty_Two {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list size: ");
        int listSize = input.nextInt();
        int[] list = new int[listSize];
        System.out.print("Enter the values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        partition(list);
        System.out.print("After partition the list is: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
    public static int partition(int[] list){
        int[] newList = new int[list.length];
        int startCounter = 0;
        int endCounter = list.length-1;
        int partitionValue = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < partitionValue) {
                newList[startCounter] = list[i];
                startCounter++;
            }
            else if (list[i] > partitionValue){
                newList[endCounter] = list[i];
                endCounter--;
            }
        }

        newList[endCounter] = partitionValue;
        //For changing the passed down list
        System.arraycopy(newList, 0, list, 0, list.length);
        return endCounter;

    }
}
