package Chapter_8.Exercises;

public class Eight_Three {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] studentsScore = new int[answers.length][2];
        //score, studentNumber pairs

        for (int i = 0; i < answers.length; i++) {
            int correctAmount=0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctAmount++;
            }

            studentsScore[i][0] = correctAmount;
            studentsScore[i][1] = i;
        }

        for (int i = 0; i < studentsScore.length-1; i++) {
            int minimumScore = studentsScore[i][0];
            int minimumScoreStudent = studentsScore[i][1];

            for (int j = i+1; j < studentsScore.length; j++) {
                if (studentsScore[j][0] < minimumScore){
                    minimumScore = studentsScore[j][0];
                    minimumScoreStudent = studentsScore[j][1];
                }
            }

            if (minimumScore != studentsScore[i][0]){
                int tempScore = studentsScore[i][0];
                int tempScoreStudent = studentsScore[i][1];
                studentsScore[i][0]= minimumScore;
                studentsScore[i][1] = minimumScoreStudent;
                studentsScore[minimumScoreStudent][0] = tempScore;
                studentsScore[minimumScoreStudent][1] = tempScoreStudent;

            }
        }

        for (int i = 0; i < studentsScore.length; i++) {
            System.out.println("Student " + studentsScore[i][1] + "'s correct count is " + studentsScore[i][0]);
        }
    }
}
