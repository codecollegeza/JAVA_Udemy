package challenges;

public class Challenge {

    public static void main(String[] args) {

        League<Team<RugbyPlayer>> rugbyLeague = new League<>("AFL");

        Team<RugbyPlayer> team1 = new Team<>("Chicago Cubs");
        Team<RugbyPlayer> team2 = new Team<>("Orlando Pirates");
        Team<RugbyPlayer> team3 = new Team<>("Melbourne Dogs");

        rugbyLeague.add(team1);
        rugbyLeague.add(team2);
        rugbyLeague.add(team3);

        rugbyLeague.showLeagueTable();

    }
}
