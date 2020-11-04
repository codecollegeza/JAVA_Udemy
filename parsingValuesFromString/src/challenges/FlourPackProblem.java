package challenges;

public class FlourPackProblem {
    // bigCount -> big flour bags(5kg)
    //smallCount -> small flour bags(1kg)
    // goal -> goal amount of kilos of flour needed
//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//
//        int bigAmount = bigCount * 5;
//        int sum = bigAmount + smallCount;
//
//        if (bigAmount > goal) {
//            return false;
//        } else if (sum == goal) {
//            return true;
//        } else if (sum > goal && (goal % 5) <= smallCount) {
//            return true;
//        } else {
//            return false;
//        }
//    } // i guess you modulo the goal by the biggest kg in this case

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if ((bigCount * 5) + smallCount == goal) {
            return true;
        } else if ((bigCount * 5) + smallCount > goal && goal % 5 <= smallCount) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean test1 = canPack(1, 0, 4);
        System.out.println(test1);

        boolean test2 = canPack(1, 0, 5);
        System.out.println(test2);

        boolean test3 = canPack(0, 5, 4);
        System.out.println(test3);

        boolean test4 = canPack(2, 2, 11);
        System.out.println(test4);

    }
}
