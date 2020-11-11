import java.util.*;

public class Main {

    // can use a class as a type param for a map
    private static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create a temp map to store exits
        Map<String, Integer> tempExits = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning java", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        tempExits.put("Q", 0);
        locations.put(1, new Location(1, "You are standing at the ned of a road before a small building", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 5);
        tempExits.put("Q", 0);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 1);
        tempExits.put("Q", 0);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        tempExits.put("Q", 0);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        tempExits.put("Q", 0);
        locations.put(5, new Location(5, "You are in the forrest", tempExits));


        // adding exits to locations
//        locations.get(1).addExit("W", 2);
//        locations.get(1).addExit("E", 3);
//        locations.get(1).addExit("S", 4);
//        locations.get(1).addExit("N", 5);
//        locations.get(1).addExit("Q", 0);
//
//        locations.get(2).addExit("N", 5);
//        locations.get(2).addExit("Q", 0);
//
//        locations.get(3).addExit("W", 1);
//        locations.get(3).addExit("Q", 0);
//
//        locations.get(4).addExit("N", 1);
//        locations.get(4).addExit("W", 2);
//        locations.get(4).addExit("Q", 0);
//
//        locations.get(5).addExit("S", 1);
//        locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);

        Map<String, String> applicableWords = new HashMap<>();
        applicableWords.put("QUIT", "Q");
        applicableWords.put("NORTH", "N");
        applicableWords.put("EAST", "E");
        applicableWords.put("SOUTH", "S");
        applicableWords.put("WEST", "W");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();

            System.out.print("Available exits: ");
            for (String key : exits.keySet()) {
                System.out.print(key + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                // then user typed in more than one word, so check if it is in map
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (applicableWords.containsKey(word)) {
                        direction = applicableWords.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
