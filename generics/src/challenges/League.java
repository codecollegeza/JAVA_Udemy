package challenges;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void add(T team) {
        if (league.contains(team)) {
            System.out.println("This team is already in the league.");
        } else {
            league.add(team);
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
