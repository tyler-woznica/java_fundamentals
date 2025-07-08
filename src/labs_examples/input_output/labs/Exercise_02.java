package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_02 {
    public static void main(String[] args) {

        String inFile = "src/labs_examples/input_output/files/char_data.txt";
        String outFile = "src/labs_examples/input_output/files/char_data_crypt.txt";

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(inFile));
             BufferedWriter writer =
                     new BufferedWriter(new FileWriter(outFile))
                ) {

            int ch;

            while ((ch = reader.read()) != -1) {

                char c = (char) ch;

                if (c == 'a') {
                    writer.write("-");
                } else if (c == 'e') {
                    writer.write('~');
                } else {
                    writer.write(c);
                }
            }

            System.out.println("File encryption successful.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(outFile))) {

            int ch;

            System.out.println("Output decrypted");

            while ((ch = reader.read()) != -1) {

                char c = (char) ch;
                if (c == '-') {
                    System.out.println('a');
                } else if (c == '~') {
                    System.out.println('e');
                } else {
                    System.out.println(c);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
