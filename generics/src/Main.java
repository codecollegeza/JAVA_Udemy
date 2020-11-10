import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList without the use of generics
        // this can lead to errors because now any type can be passed in without
        // being checked to see if it is the correct type
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
//        items.add("Kel"); --> this won't show compile time error but break during run time
        printDoubled(items);

        System.out.println("=====================");

        // here is an array list with the use of generics
        // that tells the compiler what type of data types can be passed in
        ArrayList<Integer> genericList = new ArrayList<>();
        genericList.add(1);
        genericList.add(2);
        genericList.add(3);
        genericList.add(4);
        genericList.add(5);

        printAgain(genericList);
    }

    private static void printDoubled(ArrayList n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }

    private static void printAgain(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i * 2);
        }
    }
}
