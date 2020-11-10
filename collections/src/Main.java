import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theater theater = new Theater("Imax", 8, 12);
//        theater.getSeat();

//        if (theater.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is already reserved");
//        }
//
//        if (theater.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is already reserved");
//        }

        // this fills the seat copy array with the values of the theater.seats array
        // but this is a shallow copy, so if you change data in one array, will change in other
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theater.seat");
        printList(theater.seats);

        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);

        System.out.println("\nMin seat number is " + minSeat.getSeatNumber() + " and max seat number is "
                + maxSeat.getSeatNumber());

        System.out.println("\nPrinting sorted list again");
        sortList(seatCopy);
        printList(seatCopy);
    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("========");
    }

    // variation on bubble sort
    public static void sortList(List<? extends Theater.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
