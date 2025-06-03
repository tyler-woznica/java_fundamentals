package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int[][] twoD = new int[3][3];
        int val = 1;

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = val;
                val += 1;
            }
        }
        for (int[] int1 : twoD) {
            for (int int2 : int1) {
                System.out.print(int2 + "\t");
            }
            System.out.println();
        }
    }
}
