import java.util.*;
public class Board {
    //the board itself
    BoardChunk[][] boardArray;

    ArrayList<Piece> PiecesOnBoard;
    public Board(){
        this.resetBoard();
    }
   public BoardChunk getChunk(int x, int y) throws Exception{
        if (x < 0 || x > 7 || y < 0 || y > 7){
            throw new Exception("index out of bounds");
        }
        return boardArray[x][y];
   }

   public void resetBoard(){
        Rook r1 = new Rook(true);
        Rook r2 = new Rook(true);
        Rook r3 = new Rook(false);
        Rook r4 = new Rook(false);
        Knight k1 = new Knight(true);
        Knight k2 = new Knight(true);
        Knight k3 = new Knight(false);
        Knight k4 = new Knight(false);
        Bishop b1 = new Bishop(true);
        Bishop b2 = new Bishop(true);
        Bishop b3 = new Bishop(false);
        Bishop b4 = new Bishop(false);
        King king1 = new King(true);
        King king2 = new King(false);
        Queen q1 = new Queen(true);
        Queen q2 = new Queen(false);
        Pawn p1 = new Pawn(true );
        Pawn p2 = new Pawn(true );
        Pawn p3 = new Pawn(true );
        Pawn p4 = new Pawn(true );
        Pawn p5 = new Pawn(true );
        Pawn p6 = new Pawn(true );
        Pawn p7 = new Pawn(true );
        Pawn p8 = new Pawn(true );
        Pawn p9 = new Pawn(false );
        Pawn p10 = new Pawn(false );
        Pawn p11 = new Pawn(false );
        Pawn p12 = new Pawn(false );
        Pawn p13 = new Pawn(false );
        Pawn p14 = new Pawn(false );
        Pawn p15 = new Pawn(false );
        Pawn p16 = new Pawn(false );

       boardArray[0][0] =
       boardArray[0][1]
       boardArray[0][2]
       boardArray[0][3]
       boardArray[0][4]
       boardArray[0][5]
       boardArray[0][6]
       boardArray[0][7]


        boardArray[0][0] = new BoardChunk(0,0, new Rook(true));
        boardArray[0][1] = new BoardChunk(0,0, new Knight(true));
        boardArray[0][2] = new BoardChunk(0,0, new Bishop(true));
        boardArray[0][3] = new BoardChunk(0,0, new King(true));
        boardArray[0][4] = new BoardChunk(0,0, new Queen(true));
        boardArray[0][5] = new BoardChunk(0,0, new Bishop(true));
        boardArray[0][6] = new BoardChunk(0,0, new Knight(true));
        boardArray[0][7] = new BoardChunk(0,0, new Rook(true));


        boardArray[7][0] = new BoardChunk(0,0, new Rook(false));
        boardArray[7][1] = new BoardChunk(0,0, new Knight(false));
        boardArray[7][2] = new BoardChunk(0,0, new Bishop(false));
        boardArray[7][3] = new BoardChunk(0,0, new King(false));
        boardArray[7][4] = new BoardChunk(0,0, new Queen(false));
        boardArray[7][5] = new BoardChunk(0,0, new Bishop(false));
        boardArray[7][6] = new BoardChunk(0,0, new Knight(false));
        boardArray[7][7] = new BoardChunk(0,0, new Rook(false));
        //instantiate the pawns in the right place
        for(int i = 0 ; i <= 7; i++){
            boardArray[6][i] = new BoardChunk(0,0, new Pawn(false));
            boardArray[1][i] = new BoardChunk(0,0, new Rook(true));

        }
   }
}