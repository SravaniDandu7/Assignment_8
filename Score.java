import java.util.*;

public class Score {
    public static void main(String[] args) {
        List<Integer> testScores = new ArrayList<>(Arrays.asList(75, 80, 90, 65, 85, 70, 95, 60));

        // Calculate average score
        double sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        double averageScore = sum / testScores.size();

        // Sort test scores
        Collections.sort(testScores);

        // Calculate median score
        double medianScore;
        if (testScores.size() % 2 == 0) {
            int midIndex = testScores.size() / 2;
            medianScore = (testScores.get(midIndex - 1) + testScores.get(midIndex)) / 2.0;
        } else {
            medianScore = testScores.get(testScores.size() / 2);
        }

        // Count students above, at, and below average
        int aboveAverage = 0;
        int atAverage = 0;
        int belowAverage = 0;
        for (int score : testScores) {
            if (score > averageScore) {
                aboveAverage++;
            } else if (score == averageScore) {
                atAverage++;
            } else {
                belowAverage++;
            }
        }

        // Output results
        System.out.println("Number of students who scored:");
        System.out.println("Above average: " + aboveAverage + ", Median score: " + medianScore);
        System.out.println("At average: " + atAverage + ", Median score: " + medianScore);
        System.out.println("Below average: " + belowAverage + ", Median score: " + medianScore);
    }
}
