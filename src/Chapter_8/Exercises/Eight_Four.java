package Chapter_8.Exercises;

public class Eight_Four {

    public static void main(String[] args) {
        int[][] employeesTiming ={
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9}
        };

        int[][] employeesTotalHours = new int[employeesTiming.length][2];
        //timing and index pair

        for (int i = 0; i < employeesTiming.length; i++) {
            int totalHour = 0;
            for (int j = 0; j < employeesTiming[i].length; j++) {
                totalHour+=employeesTiming[i][j];
            }
            employeesTotalHours[i][0] = totalHour;
            employeesTotalHours[i][1] = i;
        }


        //selection sort
        for (int i = 0; i < employeesTotalHours.length - 1; i++) {
            int minimumHour =employeesTotalHours[i][0];
            int minimumHourIndex = employeesTotalHours[i][1];

            for (int j = i+1; j < employeesTotalHours.length; j++) {
                if (employeesTotalHours[j][0] < minimumHour){
                    minimumHour = employeesTotalHours[j][0];
                    minimumHourIndex = employeesTotalHours[j][1];
                }
            }

            if (minimumHour != employeesTotalHours[i][0]){
                int tempScore = employeesTotalHours[i][0];
                int tempIndex = employeesTotalHours[i][1];
                employeesTotalHours[i][0] = minimumHour;
                employeesTotalHours[i][1] = minimumHourIndex;
                employeesTotalHours[minimumHourIndex][0] = tempScore;
                employeesTotalHours[minimumHourIndex][1] = tempIndex;
            }
        }

        for (int i = 0; i < employeesTotalHours.length; i++) {
            System.out.println("Employee " + employeesTotalHours[i][1] + " total working hours is : " + employeesTotalHours[i][0]);
        }
    }
}
