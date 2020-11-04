package challenges;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean test1 = isCatPlaying(true, 10);
        System.out.println(test1);

        boolean test2 = isCatPlaying(false, 36);
        System.out.println(test2);

        boolean test3 = isCatPlaying(false, 35);
        System.out.println(test3);
    }
}
