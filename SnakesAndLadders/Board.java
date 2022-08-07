
import java.util.List;

class Board {

    int[] cells;

    List<Snake> snakes;
    List<Ladder> ladders;
    Dimension dim;
    Integer numberOfDice;

    public Board(List<Snake> snakes, List<Ladder> ladders, Dimension dim, Integer numberOfDice) {
        this.snakes = snakes;
        this.ladders = ladders;
        this.dim = dim;
        this.numberOfDice = numberOfDice;
        cells = new int[dim.end];
    }
}