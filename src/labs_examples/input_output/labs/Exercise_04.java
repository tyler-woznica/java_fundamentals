package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 *
 *      Following the video examples and source code found in the
 *      src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV
 *      file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped
 *      each row of the csv to objects
 *      and added each object to an arraylist, print out each object
 *      using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file.
 *      Ensure that the resulting csv file is valid.
 *
 */

class Exercise_04 {
    public static void main(String[] args) {

        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        String filePath = "src/labs_examples/input_output/files/ex4_client.csv";




    }

    public class Client {
        int clientNumber;
        String lastName;
        String firstName;
        String type;
        int accountAge;

        public Client (int cn, String last, String first, String type, int yr) {
            this.clientNumber = cn;
            this.lastName = last;
            this.firstName =first;
            this.type = type;
            this.accountAge = yr;
        }

        @Override
        public String toString() {
            return "Client{" +
                    "clientNumber=" + clientNumber +
                    ", lastName='" + lastName + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", type='" + type + '\'' +
                    ", accountAge=" + accountAge +
                    '}';
        }
    }

}