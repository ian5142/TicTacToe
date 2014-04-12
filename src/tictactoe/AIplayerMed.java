package tictactoe;


/**
 *Creates the best possible move for a tic tac toe game
 * @author Ian Van Schaick
 */
public class AIplayerMed {
    String turn = "";
    char a1;
    char a2;
    char a3;
    
    char b1;
    char b2;
    char b3;
    
    char c1;
    char c2;
    char c3;
    
    /**
     * Creates an AIplayer object of the current board
     * params are all board positions, left-right, top-down
     * @param a
     * @param b
     * @param c 
     * @param d
     * @param e
     * @param f
     * @param g
     * @param h
     * @param i 
     */
    public AIplayerMed (char a, char b, char c, char d, char e, char f, char g, char h, char i) {
        a1 = a;
        a2 = b;
        a3 = c;
        
        b1 = d;
        b2 = e;
        b3 = f;
        
        c1 = g;
        c2 = h;
        c3 = i;
    }
    
    /**
     * calculates the best move
     * @return the position of the best move
     */
    public String BestMove () {
       //finds a move based on the game board if 2 Xs or Os line up
       if (!(turn.equals("full"))) {
           StopX();
           HelpO();
       }
       //if none of the above finds a move
        if (turn.equals("")) {
            //Horizontal
            if (a1 == 'O' && a2 == 'S') {
                turn = "a2";
            }
            else if (a1 == 'O' && a3 == 'S') {
                turn = "a3";
            }
            else if (a2 == 'O' && a1 == 'S') {
                turn = "a1";
            }
            else if (a2 == 'O' && a3 == 'S') {
                turn = "a3";
            }
            else if (a3 == 'O' && a1 == 'S') {
                turn = "a1";
            }
            else if (a3 == 'O' && a2 == 'S') {
                turn = "a2";
            }
            else if (b1 == 'O' && b2 == 'S') {
                turn = "b2";
            }
            else if (b1 == 'O' && b3 == 'S') {
                turn = "b3";
            }
            else if (b2 == 'O' && b1 == 'S') {
                turn = "b1";
            }
            else if (b2 == 'O' && b3 == 'S') {
                turn = "b3";
            }
            else if (b3 == 'O' && b1 == 'S') {
                turn = "b1";
            }
            else if (b3 == 'O' && b2 == 'S') {
                turn = "b2";
            }
            else if (c1 == 'O' && c2 == 'S') {
                turn = "c2";
            }
            else if (c1 == 'O' && c3 == 'S') {
                turn = "c3";
            }
            else if (c2 == 'O' && c1 == 'S') {
                turn = "c1";
            }
            else if (c2 == 'O' && c3 == 'S') {
                turn = "c3";
            }
            else if (c3 == 'O' && c1 == 'S') {
                turn = "c1";
            }
            else if (c3 == 'O' && c2 == 'S') {
                turn = "c2";
            }
            //Vertical
            else if (a1 == 'O' && b1 == 'S') {
                turn = "b1";
            }
            else if (a1 == 'O' && c1 == 'S') {
                turn = "c1";
            }
            else if (b1 == 'O' && a1 == 'S') {
                turn = "a1";
            }
            else if (b1 == 'O' && c1 == 'S') {
                turn = "c1";
            }
            else if (c1 == 'O' && a1 == 'S') {
                turn = "a1";
            }
            else if (c1 == 'O' && b1 == 'S') {
                turn = "b1";
            }
            else if (a2 == 'O' && b2 == 'S') {
                turn = "b2";
            }
            else if (a2 == 'O' && c2 == 'S') {
                turn = "c2";
            }
            else if (b2 == 'O' && a2 == 'S') {
                turn = "a2";
            }
            else if (b2 == 'O' && c2 == 'S') {
                turn = "c2";
            }
            else if (c2 == 'O' && a2 == 'S') {
                turn = "a2";
            }
            else if (c2 == 'O' && b2 == 'S') {
                turn = "b2";
            }
            else if (a3 == 'O' && b3 == 'S') {
                turn = "b3";
            }
            else if (a3 == 'O' && c3 == 'S') {
                turn = "c3";
            }
            else if (b3 == 'O' && a3 == 'S') {
                turn = "a3";
            }
            else if (b3 == 'O' && c3 == 'S') {
                turn = "c3";
            }
            else if (c3 == 'O' && a3 == 'S') {
                turn = "a3";
            }
            else if (c3 == 'O' && b3 == 'S') {
                turn = "b3";
            }
            //Diagonal
            else if (a1 == 'O' && b2 == 'S') {
                turn = "b2";
            }
            else if (a1 == 'O' && c3 == 'S') {
                turn = "c3";
            }
            else if (b2 == 'O' && a1 == 'S') {
                turn = "a1";
            }
            else if (b2 == 'O' && c3 == 'S') {
                turn = "c3";
            }
            else if (c3 == 'O' && a1 == 'S') {
                turn = "a1";
            }
            else if (c3 == 'O' && b2 == 'S') {
                turn = "b2";
            }
            //center options
            else if (b2 == 'O' && a1 == 'S') {
                turn = "a1";
            }
            else if (b2 == 'O' && a2 == 'S') {
                turn = "a2";
            }
            else if (b2 == 'O' && a3 == 'S') {
                turn = "a3";
            }
            else if (b2 == 'O' && b1 == 'S') {
                turn = "b1";
            }
            else if (b2 == 'O' && b3 == 'S') {
                turn = "b3";
            }
            else if (b2 == 'O' && c1 == 'S') {
                turn = "c1";
            }
            else if (b2 == 'O' && c2 == 'S') {
                turn = "c2";
            }
            else if (b2 == 'O' && c3 == 'S') {
                turn = "c3";
            }
            //any free space
            else if ( b2 == 'S' ) {
                turn = "b2";
            }
//            else if ( a2 == 'S' ) {
//                turn = "a2";
//            }
            else if ( a3 == 'S' ) {
                turn = "a3";
            }
            else if ( a1 == 'S' ) {
                turn = "a1";
            }
//            else if ( b1 == 'S' ) {
//                turn = "b1";
//            }
//            else if ( b3 == 'S' ) {
//                turn = "b3";
//            }
            else if ( c1 == 'S' ) {
                turn = "c1";
            }
//            else if ( c2 == 'S' ) {
//                turn = "c2";
//            }
            else if ( c3 == 'S' ) {
                turn = "c3";
            }
            //checks if board is full.
            else if ( (a1 == 'X' || a1 == 'O') && (a2 == 'X' || a2 == 'O') && (a3 == 'X' || a3 == 'O') &&
                   (b1 == 'X' || b1 == 'O') && (b2 == 'X' || b2 == 'O') && (b3 == 'X' || b3 == 'O') &&
                   (c1 == 'X' || c1 == 'O') && (c2 == 'X' || c2 == 'O') && (c3 == 'X' || c3 == 'O') ) {
                turn = "full";
            }
        }
        return turn;
    }
    /**
     * creates a best move by stopping X from winning
     */
    public void StopX () {
        
        if ( (a1 == 'X' || a1 == 'O') && (a2 == 'X' || a2 == 'O') && (a3 == 'X' || a3 == 'O') &&
                   (b1 == 'X' || b1 == 'O') && (b2 == 'X' || b2 == 'O') && (b3 == 'X' || b3 == 'O') &&
                   (c1 == 'X' || c1 == 'O') && (c2 == 'X' || c2 == 'O') && (c3 == 'X' || c3 == 'O') ) {
               turn = "full";
        }
        
        else if ( a1 == 'X' && a2 == 'X' && !(a3 == 'O') ) {
            turn = "a3";
        }
        
        else if ( b1 == 'X' && b2 == 'X' && !(b3 == 'O') ) {
            turn = "b3";
        }
        
        else if ( c1 == 'X' && c2 == 'X' && !(c3 == 'O') ) {
            turn = "c3";
        }
        
        else if ( a2 == 'X' && a3 == 'X' && !(a1 == 'O') ) {
            turn = "a1";
        }
        
        else if ( b2 == 'X' && b3 == 'X' && !(b1 == 'O') ) {
            turn = "b1";
        }
        
        else if ( c2 == 'X' && c3 == 'X' && !(c1 == 'O') ) {
            turn = "c1";
        }
        
        else if ( a1 == 'X' && a3 == 'X' && !(a2 == 'O') ) {
            turn = "a2";
        }
        
        else if ( b1 == 'X' && b3 == 'X' && !(b2 == 'O') ) {
            turn = "b2";
        }
                
        else if ( c1 == 'X' && c3 == 'X' && !(c2 == 'O') ) {
            turn = "c2";
        }
        
        else if ( a1 == 'X' && b1 == 'X' && !(c1 == 'O') ) {
            turn = "c1";
        }
        
        else if ( a2 == 'X' && b2 == 'X' && !(c2 == 'O') ) {
            turn = "c2";
        }
        
        else if ( a3 == 'X' && b3 == 'X' && !(c3 == 'O') ) {
            turn = "c3";
        }
        
        else if ( b1 == 'X' && c1 == 'X' && !(a1 == 'O') ) {
            turn = "a1";
        }
        
        else if ( b2 == 'X' && c2 == 'X' && !(a2 == 'O') ) {
            turn = "a2";
        }
        
        else if ( b3 == 'X' && c3 == 'X' && !(a3 == 'O') ) {
            turn = "a3";
        }
        
        else if ( a1 == 'X' && c1 == 'X' && !(b1 == 'O') ) {
            turn = "b1";
        }
        
        else if ( a2 == 'X' && c2 == 'X' && !(b2 == 'O') ) {
            turn = "b2";
        }
        
        else if ( a3 == 'X' && c3 == 'X' && !(b3 == 'O') ) {
            turn = "b3";
        }
        
        else if ( a1 == 'X' && b2 == 'X' && !(c3 == 'O') ) {
            turn = "c3";
        }
        
        else if ( b2 == 'X' && c3 == 'X' && !(a1 == 'O') ) {
            turn = "a1";
        }
        
        else if ( a1 == 'X' && c3 == 'X' && !(b2 == 'O') ) {
            turn = "b2";
        }
        
        else if ( a3 == 'X' && b2 == 'X' && !(c1 == 'O') ) {
            turn = "c1";
        }
        
        else if ( b2 == 'X' && c1 == 'X' && !(a3 == 'O') ) {
            turn = "a3";
        }
        
        else if ( a3 == 'X' && c1 == 'X' && !(b2 == 'O') ) {
            turn = "b2";
        }
        else if (a1 == 'X' && b3 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (a2 == 'X' && b3 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (c1 == 'X' && b3 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (c2 == 'X' && b3 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (b1 == 'X' && a3 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (b1 == 'X' && c3 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (b1 == 'X' && a2 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (b1 == 'X' && c2 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (a2 == 'X' && c3 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (a2 == 'X' && c1 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (c2 == 'X' && a3 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (c2 == 'X' && a1 == 'X' && b2 == 'S' ) {
            turn = "b2";
        }
        else if (a1 == 'X' && a3 == 'X' && c2 == 'X' && b3 == 'S' ) {
            turn = "b3";
        }
        else if (a1 == 'X' && b3 == 'X' && c2 == 'X' && c1 == 'S' ) {
            turn = "c1";
        }
        else if (c1 == 'X' && c3 == 'X' && a2 == 'X' && b1 == 'S' ) {
            turn = "b1";
        }
        else if (c3 == 'X' && b2 == 'X' && a1 == 'O' && b3 == 'S') {
            turn = "b3";
        }
    }

    /**
     * Creates a best move by helping O win
     */
    public void HelpO () {
        if ( a1 == 'O' && a2 == 'O' && !(a3 == 'X') ) {
            turn = "a3";
        }
        
        else if ( b1 == 'O' && b2 == 'O' && !(b3 == 'X') ) {
            turn = "b3";
        }
        
        else if ( c1 == 'O' && c2 == 'O' && !(c3 == 'X') ) {
            turn = "c3";
        }
        
        else if ( a2 == 'O' && a3 == 'O' && !(a1 == 'X') ) {
            turn = "a1";
        }
        
        else if ( b2 == 'O' && b3 == 'O' && !(b1 == 'X') ) {
            turn = "b1";
        }
        
        else if ( c2 == 'O' && c3 == 'O' && !(c1 == 'X') ) {
            turn = "c1";
        }
        
        else if ( a1 == 'O' && a3 == 'O' && !(a2 == 'X') ) {
            turn = "a2";
        }
        
        else if ( b1 == 'O' && b3 == 'O' && !(b2 == 'X') ) {
            turn = "b2";
        }
                
        else if ( c1 == 'O' && c3 == 'O' && !(c2 == 'X') ) {
            turn = "c2";
        }
        
        else if ( a1 == 'O' && b1 == 'O' && !(c1 == 'X') ) {
            turn = "c1";
        }
        
        else if ( a2 == 'O' && b2 == 'O' && !(c2 == 'X') ) {
            turn = "c2";
        }
        
        else if ( a3 == 'O' && b3 == 'O' && !(c3 == 'X') ) {
            turn = "c3";
        }
        
        else if ( b1 == 'O' && c1 == 'O' && !(a1 == 'X') ) {
            turn = "a1";
        }
        
        else if ( b2 == 'O' && c2 == 'O' && !(a2 == 'X') ) {
            turn = "a2";
        }
        
        else if ( b3 == 'O' && c3 == 'O' && !(a3 == 'X') ) {
            turn = "a3";
        }
        
        else if ( a1 == 'O' && c1 == 'O' && !(b1 == 'X') ) {
            turn = "b1";
        }
        
        else if ( a2 == 'O' && c2 == 'O' && !(b2 == 'X') ) {
            turn = "b2";
        }
        
        else if ( a3 == 'O' && c3 == 'O' && !(b3 == 'X') ) {
            turn = "b3";
        }
        
        else if ( a1 == 'O' && b2 == 'O' && !(c3 == 'X') ) {
            turn = "c3";
        }
        
        else if ( b2 == 'O' && c3 == 'O' && !(a1 == 'X') ) {
            turn = "a1";
        }
        
        else if ( a1 == 'O' && c3 == 'O' && !(b2 == 'X') ) {
            turn = "b2";
        }
        
        else if ( a3 == 'O' && b2 == 'O' && !(c1 == 'X') ) {
            turn = "c1";
        }
        
        else if ( b2 == 'O' && c1 == 'O' && !(a3 == 'X') ) {
            turn = "a3";
        }
        
        else if ( a3 == 'O' && c1 == 'O' && !(b2 == 'X') ) {
            turn = "b2";
        }
    }
}
