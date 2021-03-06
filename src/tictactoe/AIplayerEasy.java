package tictactoe;

import java.util.Random;

/**
 *
 * @author Ian Van Schaick
 */
public class AIplayerEasy {

    private String turn = "";
    private int turn2;

    private int p1;
    private int p2;
    private int p3;

    private int p4;
    private int p5;
    private int p6;

    private int p7;
    private int p8;
    private int p9;

    private char a1;
    private char a2;
    private char a3;

    private char b1;
    private char b2;
    private char b3;

    private char c1;
    private char c2;
    private char c3;

    /**
     * Creates an AIplayer object assigning a number to each board position
     *
     */
    public AIplayerEasy(char a, char b, char c, char d, char e, char f, char g, char h, char i) {
        p1 = 1;
        p2 = 2;
        p3 = 3;

        p4 = 4;
        p5 = 5;
        p6 = 6;

        p7 = 7;
        p8 = 8;
        p9 = 9;

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
     * Chooses a board position at random
     *
     * @return returns the board position chosen as a string
     */
    public String BestMove() {
        Random move = new Random();
        while (turn.equals("")) {
            turn2 = move.nextInt(9);
            if (turn2 == 1 && a1 == 'S') {
                turn = "a1";
            } else if (turn2 == 2 && a2 == 'S') {
                turn = "a2";
            } else if (turn2 == 3 && a3 == 'S') {
                turn = "a3";
            } else if (turn2 == 4 && b1 == 'S') {
                turn = "b1";
            } else if (turn2 == 5 && b2 == 'S') {
                turn = "b2";
            } else if (turn2 == 6 && b3 == 'S') {
                turn = "b3";
            } else if (turn2 == 7 && c1 == 'S') {
                turn = "c1";
            } else if (turn2 == 8 && c2 == 'S') {
                turn = "c2";
            } else if (turn2 == 9 && c3 == 'S') {
                turn = "c3";
            } else {

            }
        }

        return turn;
    }
}
