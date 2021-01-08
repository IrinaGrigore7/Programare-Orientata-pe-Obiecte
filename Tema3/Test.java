import java.io.*;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class Test {
    /**
     * Metoda Face inregistrarea echipelor si scrierea in fisier
     * @param args argumentele metodei main
     * @throws IOException aceasta exceptie este folosita pentru operatiuni de
	 *                     Input/Output esuate sau intrerupte
     */
    public static void main(String[] args) throws IOException{

        String command = args[0];
        String fileName = args[1];
        String fileNameOut = args[3];
        PrintWriter output = new PrintWriter(fileNameOut);
        File file = new File(fileName);
        if(command.equals("inscriere")) {
            TeamRegistration reg = TeamRegistration.getInstance();
            Teams listOfTeams = reg.registration(file);
            for (int i = 0; i < listOfTeams.teams.size(); i++){
                output.print("{teamName: " + listOfTeams.teams.get(i).getTeamName() + ", gender: "
                        +listOfTeams.teams.get(i).getGender() + ", numberOfPlayers: " + listOfTeams.teams.get(i).getNumberOfPlayers()
                + ", players: [");
                for(int j = 0; j < listOfTeams.teams.get(i).getNumberOfPlayers(); j++){
                    if(j != listOfTeams.teams.get(i).getNumberOfPlayers() - 1)
                         output.print("{name: " + listOfTeams.teams.get(i).players.get(j).getName() +
                            ", score: " +  listOfTeams.teams.get(i).players.get(j).getScore() + "}, ");
                    else
                        output.print("{name: " + listOfTeams.teams.get(i).players.get(j).getName() +
                                ", score: " +  listOfTeams.teams.get(i).players.get(j).getScore() + "}");
                }
                output.print("]}");
                output.println();
            }
            output.close();
        }

    }
}
