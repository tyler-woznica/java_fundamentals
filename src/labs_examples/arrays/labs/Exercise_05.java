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

        int[][] twoD = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int count = 0;

        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                if (count % 2 == 0) {
                    System.out.print(twoD[i][j] + " ");
                }
                count++;
            }
        }
    }
}
