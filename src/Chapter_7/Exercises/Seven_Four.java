package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Four {

    public static void main(String[] args) {
        int[] scores = new int[100];

        System.out.print("Keep entering score. Enter more than 100 scores or a negative number to exit: ");
        Scanner input = new Scanner(System.in);
        int scoreCount=0;
        int scoreSum = 0;
        for (int i = 0; i < scores.length; i++) {
            int score = input.nextInt();
            if (score < 0)break;
            scores[i] = score;
            scoreSum += score;
            scoreCount++;
        }

        double avgScore = scoreSum/(double)scoreCount;
        int scoresBelowAverage=0;
        int scoresAboveAverage=0;

        for (int i = 0; i < scoreCount; i++) {
            if (scores[i] < avgScore) scoresBelowAverage++;
            else scoresAboveAverage++;
        }

        System.out.print("Scores are : ");
        for (int i = 0; i < scoreCount; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.print("\nAverage is : " + avgScore);
        System.out.println("\nScores below average are : " + scoresBelowAverage);
        System.out.println("\nScores above average are : " + scoresAboveAverage);
    }
}
