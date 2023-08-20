public class Queen extends ChessPieces{
    //a simple list of the directions that can be moved in
    String[] directions = {"n", "e","s","w", "ne", "se", "sw", "nw"};


    public Queen(int x, int y, char colour){
        super(x,y,colour);
    }

    public int[][] checkMove(ChessBoard board, int[][] position) {

    }

}
