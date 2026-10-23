
public class Board {
    char[] squares = new char[64];
    
    public Board() { // constructor
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
    
    }
}