package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        String inputFile = "src/labs_examples/input_output/files/byte_data";
        String outputFile = "src/labs_examples/input_output/files/new_byte_data.txt";

        try (
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(inputFile));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFile))
            ) {
            byte[] buffer = new byte[5];
            int i;

            while ((i = in.read(buffer)) != -1) {
                out.write(buffer, 0, i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}