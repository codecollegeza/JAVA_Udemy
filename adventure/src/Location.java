import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
        this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
//        return exits;
        // going to return a new map copy here, so that classes using this map
        // can change the values if they want, since the map here is immutable/final
        return new HashMap<>(exits);
    }

    // since we create the map in the constructor, there is no need for this method
//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

}
