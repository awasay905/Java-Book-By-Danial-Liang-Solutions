package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Seventeen {
    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();
        String[] names = new String[numberOfStudents];
        double[] scores = new double[numberOfStudents];

        System.out.println("Now enter student's name and score: ");

        for (int i = 0; i < numberOfStudents; i++) {
            names[i] = input.next();
            scores[i] = input.nextDouble();
        }

        //Selection Sort


        for (int i = 0; i < numberOfStudents; i++) {
            double lowestScore = scores[i];
            int lowestScoreIndex = i;
            for (int j = i; j < numberOfStudents; j++) {
                if (scores[j] < lowestScore){
                    lowestScore = scores[j];
                    lowestScoreIndex = j;
                }
            }

            if (lowestScoreIndex != i){
                //now swap  value at lowestindex and i
                double tempScore = scores[i];
                String  tempName = names[i];
                names[i] = names[lowestScoreIndex];
                scores[i] = scores[lowestScoreIndex];
                names[lowestScoreIndex] = tempName;
                scores[lowestScoreIndex] = tempScore;
            }
        }

        System.out.println("Sorted Scores are ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10s score is %-3.3f\n", names[i], scores[i]);
        }
    }
}
