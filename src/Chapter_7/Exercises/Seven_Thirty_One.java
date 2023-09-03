package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Thirty_One {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and content: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2 size and content: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        System.out.println("Merging them ...");
        int[] mergedList = merge(list1, list2);

        System.out.print("Merged list is: ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }

    public static int[]  merge(int[] list1, int[] list2){
        int[] temp = new int[list1.length + list2.length];

        int list1Counter = 0;
        int list2Counter = 0;
        int tempCounter=0;

        for (int i = 0; i < temp.length; i++) {
            if (list1Counter < list1.length && list2Counter < list2.length){
               if (list1[list1Counter] <= list2[list2Counter]){
                   temp[i] = list1[list1Counter];
                   list1Counter++;
               } else {
                   temp[i] = list2[list2Counter];
                   list2Counter++;

               }
               tempCounter++;
            }
        }


        while (list1Counter < list1.length){
            temp[tempCounter] = list1[list1Counter];
            list1Counter++;
            tempCounter++;
        }


        while (list2Counter < list2.length){
            temp[tempCounter] = list2[list2Counter];
            list2Counter++;
            tempCounter++;
        }
        return temp;
    }
}
