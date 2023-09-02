package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_One {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        int best = 0;
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > best)best = scores[i];
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + getGrade(scores[i], best));
        }
    }

    public static String getGrade(int score, int best){
        if (score >= best-10) return "A";
        if (score >= best-20) return "B";
        if (score >= best-30) return "C";
        if (score >= best-40) return "D";
        return "F";
    }

}
