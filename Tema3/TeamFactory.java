/**
 * @author Irina Grigore - 325CB
 *
 */
public class TeamFactory {
    /**
     * Aceasta metoda foloseste design pattern-ul Factory si are rolul de a crea o instanta corespunzatoare tipului de echipa ce urmaza sa fie inscisa in competitie
     * @param teamType tipul echipei ce urmeaza sa se inscrie (football, basketball, handball)
     * @param teamName numele echipei
     * @param gender genul echipei
     * @param numberOfPlayers numarul de jucatori
     * @return
     */
    public Team getTeam(String teamType, String teamName, String gender, int numberOfPlayers){

        if (teamType == null){
            return null;
        }

        switch (teamType) {
            case "football":
                return new FootballTeam(teamName, gender, numberOfPlayers);
            case "basketball":
                return new BasketTeam(teamName, gender, numberOfPlayers);
            case "handball":
                return new HandballTeam(teamName, gender, numberOfPlayers);
            default:
                throw new IllegalStateException("Unexpected value: " + teamType);
        }
    }
}
