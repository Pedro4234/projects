
public class Board {
    char[] squares = new char[64];
    boolean whiteToMove;
    public Board() { // constructor
        whiteToMove =  true;
        String backRank = "RNBQKBNR";
        //starting pos
        for (int i = 0; i<64;i++) {
            squares[i] = '.';
        }
        for (int i = 8;i<16;i++) {
            squares[i] = 'P';
        }
        for (int i = 48;i<56;i++) {
            squares[i] = 'p';
        }
        for (int i = 0;i<8;i++) {
            squares[i] = backRank.charAt(i);
        }
        for (int i = 56;i<64;i++) {
            squares[i] = backRank.toLowerCase().charAt(i-56);
        }
    }

    public void print() {
        //print board
        for (int rank = 7; rank >= 0; rank--) {
            for (int file = 0; file < 8; file++) {
                System.out.printf("%c ",squares[((rank*8) + file)]);
            }
            // newline goes HERE: after the inner loop, still inside the outer loop
            System.out.printf("%n");
        }
        
        if (whiteToMove == true) {
            System.out.println("White to move");
        } else {
            System.out.println("Black to move");
        }

        System.out.printf("%n");
    }

    public void loadFen(String FEN) {

        // example
        // rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR b KQkq - 0 1
        /*
        fen.split(" ") splits a string on spaces into a String[], like Python’s .split(). Element [0] is the pieces field and [1] is the side to move.
        Character.isDigit(c) returns true for '0'–'9'.
        c - '0' turns the character '4' into the number 4.
        Add a field to Board for the side to move, e.g. boolean whiteToMove;.
        */  
       
        String position = FEN.split(" ")[0];
        String move = FEN.split(" ")[1];
        whiteToMove =  move.equals("w");
        int row = 7;
        int file = 0;

        for (int j = 0; j<64;j++) { // clean board
            squares[j] = '.';
        }

        for (int i = 0; i <position.length() ; i++) {
            char c = position.charAt(i);
            if (c == '/') {
                row --;
                file = 0;
            } else if (Character.isDigit(c)) {
                file = file + c - '0'; 
            } else {
                squares[row * 8 +file ] = c;
                file ++;
            }
        }
    }
    
}