import java.util.ArrayList;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class Team {
    private String teamName;
    private String gender;
    private int numberOfPlayers;
    public ArrayList<Player> players = new ArrayList<>();

    /**
     * @param teamName numele echipei
     * @param gender tipul de echipa
     * @param numberOfPlayers numarul de jucatori care formeaza o echipa
     */
    public Team(String teamName, String gender, int numberOfPlayers) {
        this.teamName = teamName;
        this.gender = gender;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
