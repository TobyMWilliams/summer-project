public class King extends Piece{
    public boolean castlingDone = false;


    public King (boolean white){
        super(white);
    }

    public boolean isCastlingDone(){
        return this.castlingDone;
    }
    public void setCastlingDone(boolean CastlingDone){
        this.castlingDone = castlingDone;
    }

    public boolean canMove(Board board, BoardChunk start, BoardChunk end){
        i
    }

}
