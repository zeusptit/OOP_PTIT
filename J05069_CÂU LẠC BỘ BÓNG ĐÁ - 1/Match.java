public class Match extends Club {
    private String matchID;
    private int matchPrice;

    public Match(String clubID, String clubName, int price, String matchID, int matchPrice) {
        super(clubID, clubName, price);
        this.matchID = matchID;
        this.matchPrice = matchPrice;
    }

    @Override
    public String toString() {
        return matchID + " " + getClubName() + " " + matchPrice;
    }

}
