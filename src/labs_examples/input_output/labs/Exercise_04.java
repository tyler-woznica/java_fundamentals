package labs_examples.input_output.labs;

import labs_examples.input_output.examples.csv_parser.Student;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

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

        ArrayList<Client> clients = new ArrayList<>();
        String filePath = "src/labs_examples/input_output/files/ex4_client.csv";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                clients.add(mapValsToClientObj(values));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Client client : clients) {
            System.out.println(client.toString());
        }

    }

    private static Client mapValsToClientObj(String[] values) {

        Client client = new Client();

        client.setClientNumber(Integer.parseInt(values[0]));
        client.setLastName(values[1]);
        client.setFirstName(values[2]);
        client.setType(values[3]);
        client.setAccountAge(Integer.parseInt(values[4]));

        return client;
    }
}