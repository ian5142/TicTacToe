/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Ian Van Schaick
 */
public class AIplayerHard {

    String turn = "";
    int turn2;

    char a1;
    char a2;
    char a3;

    char b1;
    char b2;
    char b3;

    char c1;
    char c2;
    char c3;

    Timestamp timea1 = new Timestamp(0);
    Timestamp timea2 = new Timestamp(0);
    Timestamp timea3 = new Timestamp(0);

    Timestamp timeb1 = new Timestamp(0);
    Timestamp timeb2 = new Timestamp(0);
    Timestamp timeb3 = new Timestamp(0);

    Timestamp timec1 = new Timestamp(0);
    Timestamp timec2 = new Timestamp(0);
    Timestamp timec3 = new Timestamp(0);
    Timestamp time0 = new Timestamp(0);

    int indexA1;
    int indexA2;
    int indexA3;
    int indexB1;
    int indexB2;
    int indexB3;
    int indexC1;
    int indexC2;
    int indexC3;

    int size;

    ArrayList list = new ArrayList();

    /**
     * Creates an AIplayer object assigning a number to each board position
     *
     */
    public AIplayerHard(char a, char b, char c, char d, char e, char f, char g, char h, char i,
            Timestamp time1, Timestamp time2, Timestamp time3, Timestamp time4, Timestamp time5,
            Timestamp time6, Timestamp time7, Timestamp time8, Timestamp time9) {
        a1 = a;
        a2 = b;
        a3 = c;

        b1 = d;
        b2 = e;
        b3 = f;

        c1 = g;
        c2 = h;
        c3 = i;

        timea1 = time1;
        timea2 = time2;
        timea3 = time3;

        timeb1 = time4;
        timeb2 = time5;
        timeb3 = time6;

        timec1 = time7;
        timec2 = time8;
        timec3 = time9;

        indexA1 = 10;
        indexA2 = 10;
        indexA3 = 10;
        indexB1 = 10;
        indexB2 = 10;
        indexB3 = 10;
        indexC1 = 10;
        indexC2 = 10;
        indexC3 = 10;
        list = new ArrayList();
        size = 0;
    }

    public String BestMove() {
        Order();

        if (indexA1 == 0 && a1 == 'X') { // If first move is A1
            size -= 1;
            if (size == 0) {
                turn = "b2";
            } else if (indexA2 == 2 && a2 == 'X') { //If A2 is the second move, A1
                size -= 2;
                if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3"; // possible error
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3"; // possible error
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2"; // possible error
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (size == 0) {
                    turn = "a3";
                }
            } else if (indexA3 == 2 && a3 == 'X') { //If A3 is the second move, A1
                size -= 2;
                if (size == 0) {
                    turn = "a2";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "c2";
                }
            } else if (indexB1 == 2 && b1 == 'X') { //If B1 is the second move, A1
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "a3";
                }
            } else if (indexB3 == 2 && b3 == 'X') { //If B3 is the second move, A1
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                }
            } else if (indexC1 == 2 && c1 == 'X') { //If C1 is the second move, A1
                size -= 2;
                if (size == 0) {
                    turn = "b1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "b3";
                }
            } else if (indexC2 == 2 && c2 == 'X') { //If C2 is the second move, A1
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexC3 == 2 && c3 == 'X') { //If C3 is the second move, A1
                size -= 2;
                if (size == 0) {
                    turn = "c2";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "a2";
                }
            }
        } else if (indexA2 == 0 && a2 == 'X') { // If first move is A2
            size -= 1;
            if (size == 0) {
                turn = "b2";
            } else if (indexA1 == 2 && a1 == 'X') { //If A1 is the second move, A2
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "c1";
                }
            } else if (indexA3 == 2 && a3 == 'X') { //If A3 is the second move, A2
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                }
            } else if (indexB1 == 2 && b1 == 'X') { //If B1 is the second move, A2
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                }
            } else if (indexB3 == 2 && b3 == 'X') { //If B3 is the second move, A2
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "c1";
                }
            } else if (indexC1 == 2 && c1 == 'X') { //If C1 is the second move, A2
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                }
            } else if (indexC2 == 2 && c2 == 'X') { //If C2 is the second move, A2
                size -= 2;
                if (size == 0) {
                    turn = "b3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexC3 == 2 && c3 == 'X') { //If C3 is the second move, A2
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexA3 == 4 && a3 == 'X') {
                        size -= 2;
                        if (size == 0) {
                            turn = "b3";
                        } else if (indexB1 == 6 && b1 == 'X') {
                            size -= 2;
                            turn = "c2";
                        } else if (indexC1 == 6 && c1 == 'X') {
                            size -= 2;
                            turn = "b1";
                        } else if (indexC2 == 6 && c2 == 'X') {
                            size -= 2;
                            turn = "b1";
                        }
                    } else if (indexB1 == 4 && b1 == 'X') {
                        size -= 2;
                        if (size == 0) {
                            turn = "c1";
                        } else if (indexA3 == 6 && a3 == 'X') {
                            size -= 2;
                            turn = "b3";
                        } else if (indexB3 == 6 && b3 == 'X') {
                            size -= 2;
                            turn = "a3";
                        } else if (indexC2 == 6 && c2 == 'X') {
                            size -= 2;
                            turn = "a3";
                        }
                    } else if (indexB3 == 4 && b3 == 'X') {
                        size -= 2;
                        if (size == 0) {
                            turn = "a3";
                        } else if (indexB1 == 6 && b1 == 'X') {
                            size -= 2;
                            turn = "c1";
                        } else if (indexC1 == 6 && c1 == 'X') {
                            size -= 2;
                            turn = "c2";
                        } else if (indexC2 == 6 && c2 == 'X') {
                            size -= 2;
                            turn = "c1";
                        }
                    } else if (indexC1 == 4 && c1 == 'X') {
                        size -= 2;
                        if (size == 0) {
                            turn = "c2";
                        } else if (indexA3 == 6 && a3 == 'X') {
                            size -= 2;
                            turn = "b3";
                        } else if (indexB1 == 6 && b1 == 'X') {
                            size -= 2;
                            turn = "b3";
                        } else if (indexB3 == 6 && b3 == 'X') {
                            size -= 2;
                            turn = "a3";
                        }
                    } else if (indexC2 == 4 && c2 == 'X') {
                        size -= 2;
                        if (size == 0) {
                            turn = "c1";
                        } else if (indexA3 == 6 && a3 == 'X') {
                            size -= 2;
                            turn = "b1";
                        } else if (indexB1 == 6 && b1 == 'X') {
                            size -= 2;
                            turn = "a3";
                        } else if (indexB3 == 6 && b3 == 'X') {
                            size -= 2;
                            turn = "b1";
                        }
                    }
                }
            }
        } else if (indexA3 == 0 && a3 == 'X') { // If first move is A3
            size -= 1;
            if (size == 0) {
                turn = "b2";
            } else if (indexA1 == 2 && a1 == 'X') { //If A1 is the second move, A3
                size -= 2;
                if (size == 0) {
                    turn = "a2";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexC1 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexC2 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexB1 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "c2";
                }
            } else if (indexA2 == 2 && a2 == 'X') { //If A2 is the second move, A3
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                }
            } else if (indexB1 == 2 && b1 == 'X') { //If B1 is the second move, A3
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                }
            } else if (indexB3 == 2 && b3 == 'X') { //If B3 is the second move, A3
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "a1";
                }
            } else if (indexC1 == 2 && c1 == 'X') { //If C1 is the second move, A3
                size -= 2;
                if (size == 0) {
                    turn = "b1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "b3";
                }
            } else if (indexC2 == 2 && c2 == 'X') { //If C2 is the second move, A3
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexC3 == 2 && c3 == 'X') { //If C3 is the second move, A3
                size -= 2;
                if (size == 0) {
                    turn = "b3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "b1";
                }
            }
        } else if (indexB1 == 0 && b1 == 'X') { //If B1 is the first move
            size -= 1;
            if (size == 0) {
                turn = "b2";
            } else if (indexA1 == 2 && a1 == 'X') { //If A1 is the second move, B1
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "a3";
                }
            } else if (indexA2 == 2 && a2 == 'X') { //If A2 is the second move, B1
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                }
            } else if (indexA3 == 2 && a3 == 'X') { //If A3 is the second move, B1
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexB3 == 2 && b3 == 'X') { //If B3 is the second move, B1
                size -= 2;
                if (size == 0) {
                    turn = "a2";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "c2";
                }
            } else if (indexC1 == 2 && c1 == 'X') { //If C1 is the second move, B1
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexC2 == 2 && c2 == 'X') { //If C2 is the second move, B1
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "a3";
                }
            } else if (indexC3 == 2 && c3 == 'X') { //If C3 is the second move, B1
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                }
            }
        }
        if (indexB2 == 0 && b2 == 'X') { //If B2 is the first move
            size -= 1;
            if (size == 0) {
                turn = "a1";
            } else if (indexA2 == 2 && a2 == 'X') { //If A2 is the second move, B2
                size -= 2;
                if (size == 0) {
                    turn = "c2";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "A3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                }
            } else if (indexA3 == 2 && a3 == 'X') { //If A3 is the second move, B2
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "b1";
                }
            } else if (indexB1 == 2 && b1 == 'X') { //If B1 is the second move, B2
                size -= 2;
                if (size == 0) {
                    turn = "b3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexB3 == 2 && b3 == 'X') { //If B3 is the second move, B2
                size -= 2;
                if (size == 0) {
                    turn = "b1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "c1";
                }
            } else if (indexC1 == 2 && c1 == 'X') { //If C1 is the second move, B2
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "a2";
                }
            } else if (indexC2 == 2 && c2 == 'X') { //If C2 is the second move, B2
                size -= 2;
                if (size == 0) {
                    turn = "a2";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "a3";
                }
            } else if (indexC3 == 2 && c3 == 'X') { //If C3 is the second move, B2
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "b1";
                }
            }
        } else if (indexB3 == 0 && b3 == 'X') { //If B3 is the first move
            size -= 1;
            if (size == 0) {
                turn = "b2";
            } else if (indexA1 == 2 && a1 == 'X') { //If A1 is the second move, B3
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                }
            } else if (indexA2 == 2 && a2 == 'X') { //If A2 is the second move, B3
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "c1";
                }
            } else if (indexA3 == 2 && a3 == 'X') { //If A3 is the second move, B3
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "a1";
                }
            } else if (indexB1 == 2 && b1 == 'X') { //If B1 is the second move, B3
                size -= 2;
                if (size == 0) {
                    turn = "c2";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "a2";
                }
            } else if (indexC1 == 2 && c1 == 'X') { //If C1 is the second move, B3
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexC2 == 2 && c2 == 'X') { //If C2 is the second move, B3
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "a1";
                }
            } else if (indexC3 == 2 && c3 == 'X') { //If C3 is the second move, B3
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                }
            }
        } else if (indexC1 == 0 && c1 == 'X') { //If C1 is the first move
            size -= 1;
            if (size == 0) {
                turn = "b2";
            } else if (indexA1 == 2 && a1 == 'X') { //If A1 is the second move, C1
                size -= 2;
                if (size == 0) {
                    turn = "b1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "b3";
                }
            } else if (indexA2 == 2 && a2 == 'X') { //If A2 is the second move, C1
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                }
            } else if (indexA3 == 2 && a3 == 'X') { //If A3 is the second move, C1
                size -= 2;
                if (size == 0) {
                    turn = "b3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "b1";
                }
            } else if (indexB1 == 2 && b1 == 'X') { //If B1 is the second move, C1
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexB3 == 2 && b3 == 'X') { //If B3 is the second move, C1
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexC2 == 2 && c2 == 'X') { //If C2 is the second move, C1
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a1";
                }
            } else if (indexC3 == 2 && c3 == 'X') { //If C3 is the second move, C1
                size -= 2;
                if (size == 0) {
                    turn = "c2";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a2";
                }
            }
        } else if (indexC2 == 0 && c2 == 'X') { //If C2 is the first move
            size -= 2;
            if (size == 0) {
                turn = "b2";
            } else if (indexA1 == 2 && a1 == 'X') { //If A1 is the second move, C2
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexA2 == 2 && a2 == 'X') { //If A2 is the second move, C2
                size -= 2;
                if (size == 0) {
                    turn = "b1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "b3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "b3";
                }
            } else if (indexA3 == 2 && a3 == 'X') { //If A3 is the second move, C2
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c3";
                    } else if (indexC3 == 6 && c3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                }
            } else if (indexB1 == 2 && b1 == 'X') { //If B1 is the second move, C2
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexC3 == 4 && c3 == 'X') {
                    size -= 2;
                    turn = "a3";
                }
            } else if (indexB3 == 2 && b3 == 'X') { //If B3 is the second move, C2
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "a1";
                }
            } else if (indexC1 == 2 && c1 == 'X') { //If C1 is the second move, C2
                size -= 2;
                if (size == 0) {
                    turn = "c3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a1";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a1";
                }
            } else if (indexC3 == 2 && c3 == 'X') { //If C3 is the second move, C2
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexB3 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a3";
                }
            }
        } else if (indexC3 == 0 && c3 == 'X') { //If the first move is C3
            size -= 1;
            if (size == 0) {
                turn = "b2";
            } else if (indexA1 == 2 && a1 == 'X') { //If A1 is the second move, C3
                size -= 2;
                if (size == 0) {
                    turn = "a2";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "c2";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                }
            } else if (indexA2 == 2 && a2 == 'X') { //If A2 is the second move, C3
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "b1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                }
            } else if (indexA3 == 2 && a3 == 'X') { //If A3 is the second move, C3
                size -= 2;
                if (size == 0) {
                    turn = "b3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    turn = "b1";
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "b1";
                }
            } else if (indexB1 == 2 && b1 == 'X') { //If B1 is the second move, C3
                size -= 2;
                if (size == 0) {
                    turn = "a1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "a3";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    } else if (indexC1 == 6 && c1 == 'X') {
                        size -= 2;
                        turn = "c2";
                    } else if (indexC2 == 6 && c2 == 'X') {
                        size -= 2;
                        turn = "c1";
                    }
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c1";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a3";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b3";
                    } else if (indexB3 == 6 && b3 == 'X') {
                        size -= 2;
                        turn = "a3";
                    }
                }
            } else if (indexB3 == 2 && b3 == 'X') { //If B3 is the second move, C3
                size -= 2;
                if (size == 0) {
                    turn = "a3";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "c1";
                } else if (indexC1 == 4 && c1 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "c2";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    }
                } else if (indexC2 == 4 && c2 == 'X') {
                    size -= 2;
                    turn = "c1";
                }
            } else if (indexC1 == 2 && c1 == 'X') { //If C1 is the second move, C3
                size -= 2;
                if (size == 0) {
                    turn = "c2";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexA3 == 6 && a3 == 'X') {
                        size -= 2;
                        turn = "b1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a2";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a2";
                }
            } else if (indexC2 == 2 && c2 == 'X') { //If C2 is the second move, C3
                size -= 2;
                if (size == 0) {
                    turn = "c1";
                } else if (indexA1 == 4 && a1 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA2 == 4 && a2 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexA3 == 4 && a3 == 'X') {
                    size -= 2;
                    if (size == 0) {
                        turn = "b3";
                    } else if (indexA1 == 6 && a1 == 'X') {
                        size -= 2;
                        turn = "a2";
                    } else if (indexA2 == 6 && a2 == 'X') {
                        size -= 2;
                        turn = "a1";
                    } else if (indexB1 == 6 && b1 == 'X') {
                        size -= 2;
                        turn = "a1";
                    }
                } else if (indexB1 == 4 && b1 == 'X') {
                    size -= 2;
                    turn = "a3";
                } else if (indexB3 == 4 && b3 == 'X') {
                    size -= 2;
                    turn = "a3";
                }
            }
        }

        if ((a1 == 'X' || a1 == 'O') && (a2 == 'X' || a2 == 'O') && (a3 == 'X' || a3 == 'O')
                && (b1 == 'X' || b1 == 'O') && (b2 == 'X' || b2 == 'O') && (b3 == 'X' || b3 == 'O')
                && (c1 == 'X' || c1 == 'O') && (c2 == 'X' || c2 == 'O') && (c3 == 'X' || c3 == 'O')) {
            turn = "full";
            size -= 9;
        }

//        System.out.println(list); //If A2 is the second move, C3
//        System.out.println(size);
        return turn;
    } //end of method

    private void Order() {

        // Checks to see if timestamp is the default time and date
        if (timea1.equals(time0)) {
            indexA1 = 99;
        }
        if (timea2.equals(time0)) {
            indexA2 = 99;
        }
        if (timea3.equals(time0)) {
            indexA3 = 99;
        }
        if (timeb1.equals(time0)) {
            indexB1 = 99;
        }
        if (timeb2.equals(time0)) {
            indexB2 = 99;
        }
        if (timeb3.equals(time0)) {
            indexB3 = 99;
        }
        if (timec1.equals(time0)) {
            indexC1 = 99;
        }
        if (timec2.equals(time0)) {
            indexC2 = 99;
        }
        if (timec3.equals(time0)) {
            indexC3 = 99;
        }
        // Adds times to an arraylist
        if (!(timea1.equals(time0))) {
            list.add(timea1);
        }

        if (!(timea2.equals(time0))) {
            list.add(timea2);
        }

        if (!(timea3.equals(time0))) {
            list.add(timea3);
        }

        if (!(timeb1.equals(time0))) {
            list.add(timeb1);
        }

        if (!(timeb2.equals(time0))) {
            list.add(timeb2);
        }

        if (!(timeb3.equals(time0))) {
            list.add(timeb3);
        }

        if (!(timec1.equals(time0))) {
            list.add(timec1);
        }

        if (!(timec2.equals(time0))) {
            list.add(timec2);
        }

        if (!(timec3.equals(time0))) {
            list.add(timec3);
        }

        Collections.sort(list, new timeComparator());

        indexA1 = list.indexOf(timea1);
        indexA2 = list.indexOf(timea2);
        indexA3 = list.indexOf(timea3);

        indexB1 = list.indexOf(timeb1);
        indexB2 = list.indexOf(timeb2);
        indexB3 = list.indexOf(timeb3);

        indexC1 = list.indexOf(timec1);
        indexC2 = list.indexOf(timec2);
        indexC3 = list.indexOf(timec3);
        size = list.size();

    }

    private static class timeComparator implements Comparator<Timestamp> {

        @Override
        public int compare(Timestamp time1, Timestamp time2) {
            return (time1.before(time2)) ? -1 : (time1.after(time2)) ? 1 : 0;
        }
    }
}
