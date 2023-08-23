import java.util.ArrayList;

public abstract class Piece {
    ArrayList<BoardChunk> moves;
    private boolean killed = false;
    // displayed as a boolean which can therefore assert the two colours
    // i.e. if not white: black
    private boolean white = false;
    public Piece(boolean white) {
        this.white = white;
    }
    public boolean isWhite(){
        return this.white;
    }
    public void setWhite(boolean white){
        this.white = white;
    }

    public boolean isKilled() {
        return this.killed;
    }
    public void setKilled(boolean killed){
        this.killed = killed;
    }
    public abstract boolean canMove(Board board, BoardChunk start);

    public abstract ArrayList<BoardChunk> moves(Board board, BoardChunk start);


    }
}
