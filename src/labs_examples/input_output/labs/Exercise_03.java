package labs_examples.input_output.labs;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class Exercise_03 {
    public static void main(String[] args) {
        String byteFile = "src/labs_examples/input_output/files/byte_data";
        String charFile = "src/labs_examples/input_output/files/char_data.txt";

        try (
                FileOutputStream fos = new FileOutputStream(byteFile);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos);
                ) {
            dos.writ
        }
    }
}