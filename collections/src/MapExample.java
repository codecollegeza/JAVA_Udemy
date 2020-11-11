import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // same as dictionary in python or object in js with key value pair
        // Can only contain one set of keys, no duplicates

        Map<String, String> languages = new HashMap<>(); // -> hash map is an unordered map
        languages.put("Java", "A very complicated language.");
        languages.put("Python", "A much easier  language.");
        languages.put("Algol", "I have no idea what this language is.");
        languages.put("JavaScript", "My favorite language so far.");

        System.out.println(languages.get("Java"));

        // can check if map already contains a key
        if (languages.containsKey("Java")) {
            System.out.println("Java already in map");
        } else {
            languages.put("Java", " added again.");
        }

        System.out.println("===============================");

        // ways to remove something from a map
        // can jusy use their key, or use key/ value pair
        languages.remove("Algol");
        // or
        if (languages.remove("JavaScript", "This is a test")) {
            System.out.println("Javascript was removed");
        } else {
            System.out.println("Not removed, key/value pair not found.");
        }

        // looping through a map using its keys
        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

        // can replace values
        languages.replace("Algol", "This is a replacement.");
    }
}
