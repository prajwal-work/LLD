import java.util.List;
import java.util.Queue;

class Game{

    Board board;
    Queue<Player> q;
       
    public Game(Board board, Queue<Player> q) {
        this.board = board;
        this.q = q;
    }
    int updatedPosition(String name, int pos, List<Snake> snakes, List<Ladder> ladders){

        for(Snake i : snakes){
            if(i.start==pos){
                System.out.println(name+" was bitten at position "+pos);
                return i.end;
            }
        }
        for(Ladder i : ladders){
            if(i.start==pos){
                System.out.println(name+" took the ladder at position "+pos);
                return i.end;
            }
        }
        return -1;

    }
    void start(Queue<Player> q){

        while(q.size()>1){
            Player player = q.poll();
            System.out.println(player.name+" has the turn.");
            int initial_pos = player.position;

            int val = player.turn(board.numberOfDice);
            System.out.println(player.name+" rolled out "+val);
            int final_pos = initial_pos + val;
            int updated_pos = final_pos;
            if(updated_pos==board.dim.end){
                // winner is declared
                System.out.println(player.name+" is now at position "+updated_pos);
                System.out.println(player.name+" WON");
                System.out.println();
                continue;
            }
            if(final_pos < board.dim.end){
                updated_pos = updatedPosition(player.name, final_pos, board.snakes, board.ladders);
                if(updated_pos==-1){
                    updated_pos = final_pos;
                }
            }
            else{
                updated_pos = initial_pos;
            }
            player.position = updated_pos;
            System.out.println(player.name+" is now at position "+updated_pos);
            System.out.println();
            q.add(player);
        }
        System.out.println("END GAME");
    }
}