import java.util.Scanner;

public class TestEvaluation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctAnswers = sc.nextLine().toUpperCase();
        int n = Integer.parseInt(sc.nextLine());
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            String studentAnswers = sc.nextLine().toUpperCase();
            scores[i] = evaluateTest(correctAnswers, studentAnswers);
        }
        for (double score : scores) {
            System.out.print(score + " ");
        }
    }
    
    public static double evaluateTest(String correctAnswers, String studentAnswers) {
        if (correctAnswers.length() != studentAnswers.length()) {
            throw new IllegalArgumentException("Number of questions in correct answers and student answers do not match.");
        }
        
        double score = 0;
        for (int i = 0; i < correctAnswers.length(); i++) {
            char correctAnswer = correctAnswers.charAt(i);
            char studentAnswer = studentAnswers.charAt(i);
            if (studentAnswer == 'X') {
                continue;
            }
            if (studentAnswer != 'A' && studentAnswer != 'B' && studentAnswer != 'C' && studentAnswer != 'D') {
                throw new IllegalArgumentException("Invalid answer '" + studentAnswer + "' at question " + (i+1) + ".");
            }
            if (studentAnswer == correctAnswer) {
                score += 1;
            } else {
                score -= 0.25;
            }
        }
        
        return score;
    }
}
