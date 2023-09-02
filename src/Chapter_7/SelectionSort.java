package Chapter_7;

public class SelectionSort {

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length -1; i++) {

            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = 1+i; j < list.length; j++) {
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
