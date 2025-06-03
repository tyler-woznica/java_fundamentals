package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] irregular = new int[4][];
        irregular[0] = new int[2];
        irregular[1] = new int[3];
        irregular[2] = new int[4];
        irregular[3] = new int[5];

        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                irregular[i][j] = (i + 1) * j;
            }
        }

        for (int[] int1 : irregular) {
            for (int int2 : int1) {
                System.out.print(int2 + "\t");
            }
            System.out.println();
        }
    }
}
