import java.util.Scanner;

public class OnlineQuiz {
    private String[][] questions = {
        {"What is the purpose of the 'if' statement in Java?", "To declare a variable", "To handle exceptions", "To make a decision based on a condition", "To loop through a block of code"},
        {"What is the purpose of the 'switch' statement in Java?", "To declare a variable", "To handle exceptions", "To make a decision based on multiple conditions", "To loop through a block of code"},

        {"How do you get user input in Java?", "Using the Scanner class", "Using the BufferedReader class", "Using the InputStreamReader class", "Using the System.in class"},

        {"What is the purpose of the 'ArrayList' class in Java?", "To store a fixed-size array", "To store a dynamic-size array", "To store a 2D array", "To store a 3D array"},

        {"What is the purpose of the 'HashMap' class in Java?", "To store a collection of key-value pairs", "To store a collection of unique values", "To store a collection of duplicate values", "To store a collection of null values"},

        {"What is the purpose of the 'while' loop in Java?", "To loop through a block of code once", "To loop through a block of code multiple times", "To loop through a block of code until a condition is met", "To loop through a block of code indefinitely"},

        {"What is the purpose of the 'for' loop in Java?", "To loop through a block of code once", "To loop through a block of code multiple times", "To loop through a block of code until a condition is met", "To loop through a block of code indefinitely"},

        {"What is the purpose of the 'break' statement in Java?", "To exit a loop", "To skip the current iteration", "To jump to a labeled statement", "To throw an exception"},

        {"What is the purpose of the 'continue' statement in Java?", "To exit a loop", "To skip the current iteration", "To jump to a labeled statement", "To throw an exception"},

        {"What is the purpose of the 'do-while' loop in Java?", "To loop through a block of code once", "To loop through a block of code multiple times", "To loop through a block of code until a condition is met", "To loop through a block of code indefinitely"}

    };

    private int[] correctAnswers = {2, 2, 0, 1, 0, 2, 2, 0, 1, 2};

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
            for (int j = 1; j < questions[i].length; j++) {
                System.out.println((j) + ". " + questions[i][j]);
            }
            System.out.print("Enter your answer (1-" + (questions[i].length - 1) + "): ");
            int answer = scanner.nextInt() - 1;
            if (answer == correctAnswers[i]) {
                System.out.println("Correct!");
                score += 4; // Add 4 marks for correct answer
            } else {
                System.out.println("Incorrect. The correct answer is " + (correctAnswers[i] + 1) + ". " + questions[i][correctAnswers[i] + 1]);
            }
            System.out.println();
        }

        System.out.println("Quiz complete! Your final score is " + score + " out of " + (questions.length * 4));
        System.out.println("Scoring:");
        if (score >= 32) {
            System.out.println("Excellent! You scored " + score + " out of " + (questions.length * 4) + ". You have a deep understanding of Java fundamentals.");
        } else if (score >= 20) {
            System.out.println("Good! You scored " + score + " out of " + (questions.length * 4) + ". You have a good understanding of Java fundamentals, but there's room for improvement.");
        } else {
            System.out.println("You scored " + score + " out of " + (questions.length * 4) + ". You may want to review Java fundamentals to improve your understanding.");
        }
    }

    public static void main(String[] args) {
        OnlineQuiz quiz = new OnlineQuiz();
        quiz.startQuiz();
    }
}