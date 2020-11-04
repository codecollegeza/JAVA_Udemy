package challenges;

public class SumThreeAndFive {
    public static void main(String[] args) {

        int sum = 0;
        int tracker = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                sum += i;
                System.out.println(i);
                tracker++;
                if (tracker == 5) {
                    break;
                }
            }
        }

        System.out.println("The sum of the above loop = " + sum);
    }
}
