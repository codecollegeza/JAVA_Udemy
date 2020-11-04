package challenges;

public class MethodChallenge {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        int position2 = calculateHighScorePosition(900);
        int position3 = calculateHighScorePosition(400);
        int position4 = calculateHighScorePosition(50);

        displayHighScorePosition("James", position);
        displayHighScorePosition("Arthur", position2);
        displayHighScorePosition("Macavoy", position3);
        displayHighScorePosition("Dirk", position4);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + ", managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
