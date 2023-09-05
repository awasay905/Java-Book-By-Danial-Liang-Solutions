package Chapter_7.Exercises;

import java.util.Scanner;

public class Seven_Thirty_Five {
    public static String[] words = {
            "Computer", "Programming", "Technology", "Software", "Hardware", "Algorithm",
            "Code", "Data", "Security", "Networking", "Internet", "Web", "Database",
            "Server", "Cloud", "Encryption", "Operating System", "CPU", "RAM", "GPU",
            "Virtualization", "Artificial Intelligence", "Machine Learning", "Big Data",
            "Blockchain", "IoT", "Robotics", "Automation", "Interface", "Responsive",
            "Debugging", "Version Control", "Open Source", "API", "GUI", "Backend",
            "Frontend", "Compiler", "Scripting", "DevOps", "Agile", "Scrum", "Science",
            "Augmented", "Virtual", "Cyberattack", "Hacker", "Bug", "Vulnerability"
    };
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameRunning = true;
        int wins = 0;
        int lose = 0;

        while (gameRunning){
            String word = words[(int)(Math.random()* words.length)].toUpperCase();
            int numOfGuesses = word.length();
            String guess = makeGuess(word);
            int guesses = 0;
            int correctGuess = 0;
            boolean hasWon = false;

            System.out.println(word);

            while (guesses < numOfGuesses){

                System.out.println("(Guess) Enter a letter in word: " + guess);
                String answer = input.next().toUpperCase();

                boolean isCorrect = false;
                String newGuess = "";
                for (int i = 0; i < word.length(); i++) {
                    if (answer.charAt(0) == word.charAt(i)){
                        correctGuess++;
                        isCorrect = true;
                        newGuess += answer.charAt(0);
                    } else {
                        if (guess.charAt(i) == '*') newGuess += "*";
                        else newGuess += guess.charAt(i);
                    }
                }
                if (!isCorrect) System.out.println("wrong guess. guess again");
                guesses++;
                guess = newGuess;
                if (newGuess.equalsIgnoreCase(word)){
                    wins++;
                    System.out.println("You win");
                    break;
                }
            }

            if (!guess.equals(word)) {
                lose++;
                System.out.println("You Lose");
            }
            System.out.print("Do you want to play another game?\nPress Y for yes, N for no: ");
            if (!input.next().equalsIgnoreCase("y")) gameRunning = false;
        }

        System.out.println("-----Game Finished-----");
        System.out.println("Wins : " + wins);
        System.out.println("loses : " + lose);
    }

    public static String makeGuess(String word){
        String s = "";
        for (int i = 0; i < word.length(); i++) {
            s += "*";
        }
        return s;
    }
}
