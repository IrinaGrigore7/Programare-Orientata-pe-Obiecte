/**
 * @author Irina Grigore - 325CB
 *
 */
public class Player {
    private String name;
    private int score;

    /**
     * @param name numele unui jucator
     * @param score scorul obtinut de jucator
     */
    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
