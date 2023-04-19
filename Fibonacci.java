import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
* This program takes num input from a file,
* and does a Fibonacci for said num.
*
* @author Logan S
* @version 1.0
* @since 2023-04-17
*/

public final class Fibonacci {

    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */

    private Fibonacci() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */

    public static void main(String[] args) {

        try {

            final ArrayList<String> input = new ArrayList<String>();

            // Create input file.
            final File inputFile = new File("input.txt");
            // Create output
            final FileWriter outputFile = new FileWriter("output.txt");

            // Creating the file into a String variable.
            final Scanner sc = new Scanner(inputFile);

            while (sc.hasNextLine()) {
                // Add each line of the file to the ArrayList.
                input.add(sc.nextLine());
            }

            for (String strLine : input) {

                // Parse the input to integer
                final int fibonacci = RecFib(Integer.parseInt(strLine));
                // Write and print the fibonacci sequence to the output file.
                outputFile.write(fibonacci + "\n");
                System.out.println(fibonacci);

            }
            // Closing FileWriter
            outputFile.close();

            // Closing Scanner
            sc.close();

        } catch (IOException exception) {
            System.out.println("Error: File does not exist.");
        }
    }

    /**
    * This is the main method.
    *
    * @param num The number.
    * @return the reversed string.
    */

    public static int recFib(int num) {

        // Check if the number is 0
        if (num == 0) {
            return num;
        // Check if the number is 1
        } else if (num == 1) {
            return num;
        } else {
            // If the numbers aren't 1 or 0, return the function
            return RecFib(num - 1) + RecFib(num - 2);
        }
    }
}
