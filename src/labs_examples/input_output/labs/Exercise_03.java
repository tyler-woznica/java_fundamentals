package labs_examples.input_output.labs;

import java.io.*;

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
        String byteFile = "src/labs_examples/input_output/files/ex03_byte_file.txt";
        String charFile = "src/labs_examples/input_output/files/ex03_char_file.txt";

        try (
                FileOutputStream fos = new FileOutputStream(byteFile);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos);
                ) {
            dos.writeInt(123);
            dos.writeDouble(12.34);
            dos.writeUTF("Many bytes");
            System.out.println("Byte stream complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (
                FileInputStream fis = new FileInputStream(byteFile);
                DataInputStream dis = new DataInputStream(fis);
                ) {
            int num = dis.readInt();
            double val = dis.readDouble();
            String txt = dis.readUTF();

            System.out.println("Byte stream read");
            System.out.println("Int: " + num);
            System.out.println("Double: " + val);
            System.out.println("String: " + txt);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                FileWriter writer = new FileWriter(charFile);
                FileReader reader = new FileReader(charFile);
                ) {
            writer.write("Character data.\n");
            writer.write("This is line 2.");
            System.out.println("Char stream complete.");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                BufferedReader br =
                        new BufferedReader(new FileReader(charFile))
                ) {
            String line;
            System.out.println("\nChar stream read:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}