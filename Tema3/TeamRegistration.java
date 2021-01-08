import java.io.*;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class TeamRegistration {

    private static TeamRegistration singleInstance = null;

    /**
     * Aceasta metoda foloseste design pattern-ul Singleton si are rolul de a crea o singura instanta a acestei clase
     * @return o singura instanta a clasei
     */
    public static TeamRegistration getInstance(){
        if(singleInstance == null)
            singleInstance = new TeamRegistration();
        return singleInstance;
    }

    /**
     * Aceasta metoda face inscrierea echipelor in competitie
     * @param file fisierul de intrare
     * @return lista echipelor care au fost inscrise in competitie
     * @throws IOException aceasta exceptie este folosita pentru operatiuni de
	 *                     Input/Output esuate sau intrerupte
     */
    public Teams registration(File file) throws IOException {
        int numberOfPlayers;
        Teams listOfTeams = new Teams();
        TeamFactory teamFactory = new TeamFactory();
        
        BufferedReader br;
        br = new BufferedReader(new FileReader(file));
        String st;
        String[] parts;

        while ( (st = br.readLine()) != null) {
            parts = st.split(", ");
            Team team = teamFactory.getTeam(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]));
            numberOfPlayers = Integer.parseInt(parts[3]);
            for(int i = 0; i < numberOfPlayers; i++) {
                st = br.readLine();
                parts = st.split(" |\\, ");
                Player player = new Player(parts[0], Integer.parseInt(parts[1]));
                team.players.add(player);
            }
            listOfTeams.teams.add(team);
        }
        br.close();
        return listOfTeams;
    }
}