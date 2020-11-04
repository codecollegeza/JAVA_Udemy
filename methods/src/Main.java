public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;

        // Method call with arguments
        // can use variable names as values passed in
        calculateScore(gameOver, score, levelsCompleted, bonus);

        // assigning value to variable via method that returns a value
        int finalScore = calculateScoreAndReturn(gameOver, score, levelsCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        // Second Method call with different args
        // can insert manual values in as well
        calculateScore(true, 10000, 8, 200);
        int finalScore2 = calculateScoreAndReturn(true, 10000, 8, 200);
        System.out.println("Your final score was " + finalScore2);
    }

    // how to declare a static void method that takes parameters
    public static void calculateScore(boolean gameOver, int score, int levelsCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelsCompleted = 5;
//        int bonus = 100;
        if (gameOver) {
            int finalScore = score + (levelsCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    // Method to return a value
    // need to specify the return type in method declaration
    public static int calculateScoreAndReturn(boolean gameOver, int score, int levelsCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelsCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        // how to return a value
        return -1;
    }
}
