import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Runner {

    static Board createBoard(){

        Dimension dim = new Dimension(100);
        List<Snake> snakes = new ArrayList<>();

        Snake ones = new Snake(86, 49);
        Snake twos = new Snake(61, 50);
        Snake threes = new Snake(37, 10);
        Snake fours = new Snake(91, 2);
        Snake fives = new Snake(59, 32);

        snakes.add(ones);
        snakes.add(twos);
        snakes.add(threes);
        snakes.add(fours);
        snakes.add(fives);


        List<Ladder> ladders = new ArrayList<>();

        Ladder onel = new Ladder(5, 62);
        Ladder twol = new Ladder(25, 89);
        Ladder threel = new Ladder(49, 78);
        Ladder fourl = new Ladder(30, 99);
        Ladder fivel = new Ladder(65, 75);

        ladders.add(onel);
        ladders.add(twol);
        ladders.add(threel);
        ladders.add(fourl);
        ladders.add(fivel);

        Board board = new Board(snakes, ladders, dim, 1);
        
        return board;
    }
    static Queue<Player> addPlayers(){
        Queue<Player> q = new LinkedList<>();
        Player one = new Player("bhandu");
        Player two = new Player("psyduck");
        Player three = new Player("longbeach");
        Player four = new Player("greg");

        q.add(one);
        q.add(two);
        q.add(three);
        q.add(four);

        return q;
    }
    public static void main(String[] args) {
        
        Board board = createBoard();
        Queue<Player> q = addPlayers();

        Game new_game = new Game(board, q);
        new_game.start(q);
 
    }
}
