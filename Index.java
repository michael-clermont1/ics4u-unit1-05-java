/*
 *
 * The program gets the wood length
 *
 * @author:  Michael Clermontl
 * @version: 1.0
 * @since:   2022-9-26
*/

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* This is the starting of main program.
*/
public final class Index {
    /**
     * Constant VOLUME variable.
     *
     */
    public static final int VOLUME = 144;

    /**
    * The utility class lint exception rule.
    *
    */
    private Index() {
        // nothing called
    }

    /**
    * The main calculation function.
    *
    * @param width - width number
    * @param height - height number
    * @return length - int
    */

    static float lengthCalculator(float width, float height) {
        final float length = VOLUME / height / width;
        return length;
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used.
    */

    public static void main(final String[] args) {
        try {
            final Scanner sc = new Scanner(System.in);
            System.out.print("Enter the width(inch): ");
            final float widthNumber = sc.nextFloat();
            System.out.print("Enter the height(inch): ");
            final float heightNumber = sc.nextFloat();
            System.out.printf("\nThe wood should be %.1f inch(es) long.",
                            lengthCalculator(widthNumber, heightNumber));
        } catch (InputMismatchException ex) {
            System.out.println("Input Invalid");
        }
        System.out.println("\nDone.");
    }
}
