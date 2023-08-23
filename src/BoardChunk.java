public class BoardChunk {
    private Piece piece;
    private int x, y;


    public BoardChunk(int x, int y, Piece piece){
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    //overloaded constructor allowing the empty space to be populated without a piece or empty piece
    public BoardChunk(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public boolean hasPiece(boolean white){
        return
    }
}
