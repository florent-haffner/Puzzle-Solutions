import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTrns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            for (int i = 0; i <= remainingTurns; i++) {
                // On est good
                if (lightX == initialTx && lightY < initialTy) {
                    System.out.println("N");
                }
                if (lightX > initialTx && lightY == initialTy) {
                    System.out.println("E");
                }
                if (lightX < initialTx && lightY == initialTy) {
                    System.out.println("W");
                }
                if (lightX == initialTx && lightY > initialTy) {
                    System.out.println("S");
                }

                // TODO : Cibler plus pres !
                if (lightX > initialTx && lightY > initialTy) {
                    System.out.println("SE");
                }
                if (lightX < initialTx && lightY < initialTy) {
                    System.out.println("NE");
                }
                 if (lightX < initialTx && lightY > initialTy) {
                    System.out.println("SW");
                }
                if (lightX < initialTx && lightY < initialTy) {
                    System.out.println("NW");
                }
            }
            // A single line providing the move to be made: N NE E SE S SW W or NW
            //System.out.println("SE");
        }
    }
}
