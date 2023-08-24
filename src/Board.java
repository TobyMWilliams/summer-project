private static ArrayList <ChessPieces> piecesOnBoard;
static BoardChunk[][] chessboard;
    public ChessBoard(){
        chessboard = new BoardChunk[8][8];
    }

    public void startPieces(){
        Rook r1 = new Rook(0,0,true);
        Rook r2 = new Rook(7,0,true);
        Rook r3 = new Rook(0,7,false);
        Rook r4 = new Rook(7,7,false);
        Bishop b1 = new Bishop(1,0,true);
        Bishop b2 = new Bishop(6,0,true);
        Bishop b3 = new Bishop(1,7,false);
        Bishop b4 = new Bishop(6,7,false);
        Knight k1 = new Knight (2,0,true);
        Knight k2 = new Knight (5,0,true);
        Knight k3 = new Knight (2,7,false);
        Knight k4 = new Knight (5,7,false);
        King king1 = new King(4, 0, true);
        King king2 = new King(4, 7, false);
        Queen q1 = new Queen (3,0,true);
        Queen q2 = new Queen (3, 7,false);

        Pawn p1  = new Pawn( 0, 1, true);
        Pawn p2  = new Pawn( 1, 1, true);
        Pawn p3  = new Pawn( 2, 1, true);
        Pawn p4  = new Pawn( 3, 1, true);
        Pawn p5  = new Pawn( 4, 1, true);
        Pawn p6  = new Pawn( 5, 1, true);
        Pawn p7  = new Pawn( 6, 1, true);
        Pawn p8  = new Pawn( 7, 1, true);

        Pawn p11  = new Pawn( 0, 6, false);
        Pawn p22  = new Pawn( 1, 6, false);
        Pawn p33  = new Pawn( 2, 6, false);
        Pawn p44  = new Pawn( 3, 6, false);
        Pawn p55  = new Pawn( 4, 6, false);
        Pawn p66  = new Pawn( 5, 6, false);
        Pawn p77  = new Pawn( 6, 6, false);
        Pawn p88  = new Pawn( 7, 6, false);

        // at this point the pieces are instantiated and added to the running AL

        piecesOnBoard.add(r1);
        piecesOnBoard.add(r2);
        piecesOnBoard.add(r3);
        piecesOnBoard.add(r4);
        piecesOnBoard.add(b1);
        piecesOnBoard.add(b2);
        piecesOnBoard.add(b3);
        piecesOnBoard.add(b4);
        piecesOnBoard.add(k1);
        piecesOnBoard.add(k2);
        piecesOnBoard.add(k3);
        piecesOnBoard.add(k4);
        piecesOnBoard.add(king1);
        piecesOnBoard.add(king2);
        piecesOnBoard.add(q1);
        piecesOnBoard.add(q2);
        piecesOnBoard.add(p1);
        piecesOnBoard.add(p2);
        piecesOnBoard.add(p3);
        piecesOnBoard.add(p4);
        piecesOnBoard.add(p5);
        piecesOnBoard.add(p6);
        piecesOnBoard.add(p7);
        piecesOnBoard.add(p8);
        piecesOnBoard.add(p11);
        piecesOnBoard.add(p22);
        piecesOnBoard.add(p33);
        piecesOnBoard.add(p44);
        piecesOnBoard.add(p55);
        piecesOnBoard.add(p66);
        piecesOnBoard.add(p77);
        piecesOnBoard.add(p88);


        //we now add these to the 2D array
        for(int i = 0 ; i < piecesOnBoard.size() ; i++){
            int x = piecesOnBoard.get(i).getX();
            int y = piecesOnBoard.get(i).getY();
            chessboard[x][y] = new BoardChunk(x,y,piecesOnBoard.get(i));
        }

        for(int i = 2 ; i <= 5 ; i++){
            for(int y = 0 ; y <= 7 ; y++){
                chessboard[y][i] = new BoardChunk(y,i);
            }
        }

    }
    public void movePiece(){

    }
    //seperate methods to start the board playing white or black
    //todo
    public void startBoardWhite(){

    }
    //todo
    public void startBoardBlack(){

    }
    public void addPiece(ChessPieces piece){
        piecesOnBoard.add(piece);
    }

    public static BoardChunk getChunk(int x, int y){
        return chessboard[x][y];
    }

    public BoardChunk[][] getChessboard(){
        return chessboard;
    }

    public static ArrayList<ChessPieces> getPiecesOnBoard(){
        return piecesOnBoard;
    }

    /**
     * defaults to return that the colours don't match and the piece can
     * therefore move to the denoted coords x,y
     */
    public static boolean matchingColour(int x, int y, boolean white){
        boolean out = false;
        for (int i = 0 ; i < piecesOnBoard.size() ; i++){
            if((piecesOnBoard.get(i).getX() == x) && (piecesOnBoard.get(i).getY() == y) &&(piecesOnBoard.get(i).isWhite() == white)){
                out = true;
            }
        }
        return out;
    }
}
