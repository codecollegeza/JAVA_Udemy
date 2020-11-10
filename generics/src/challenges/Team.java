package challenges;

import java.util.ArrayList;

// now type param will only accept types that is or inherits from the player class
public class Team<T extends Player> implements Comparable<Team<T>> {

    private final String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private final ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + name);
        }
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (ranking() > team.ranking()) {
            return -1;
        } else if (ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
