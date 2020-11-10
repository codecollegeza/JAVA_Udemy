public class MainPart2 {

    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago Cubs");
        baseBallPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Orlando Pirates");
        soccerPlayerTeam.addPlayer(beckham);

        Team<FootBallPlayer> footBallPlayerTeam = new Team<>("Melbourne Dogs");
        FootBallPlayer zack = new FootBallPlayer("zack");
        footBallPlayerTeam.addPlayer(zack);

        System.out.println("======================");

        adelaideCrows.matchResult(footBallPlayerTeam, 45, 23);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(footBallPlayerTeam.getName() + ": " + footBallPlayerTeam.ranking());

        System.out.println(adelaideCrows.compareTo(footBallPlayerTeam));
    }
}
