package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {

    // overload 1
    static void greet() {
        System.out.println("Hello there.");
    }

    // overlaod 2
    static void greet(String name) {
        System.out.println("Hello there, " + name + ".");
    }

    //
    static int changeVal(int x) {
        x = 100; // will not affect original
        return x;
    }

    static void changeArray(int[] arr) {
        arr[0] = 100; // will affect original array
    }

    // 3) Return largest of 4 numbers
    static int maxOfFour(int a, int b, int c, int d) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }

    static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        for(char ch : str.toCharArray()) {
            if(ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }

    // 5) Check if number is prime
    static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    // 6) Return highest and lowest in array
    static int[] highLow(int[] nums) {
        int high = nums[0];
        int low = nums[0];
        for(int n : nums) {
            if(n > high) high = n;
            if(n < low) low = n;
        }
        return new int[]{high, low};
    }

    // 7) Return ArrayList of numbers divisible by both
    static ArrayList<Integer> divisibleList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i <= maxNum; i++) {
            if(i % divisor1 == 0 && i % divisor2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    // 8) Reverse array in place using one temp variable
    static void reverseArray(int[] nums) {
        int temp;
        for(int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }


    public static void main(String[] args) {
        // 1) Method Overloading
        greet();
        greet("Ty");

        // 2) Pass by value vs reference
        int num = 50;
        int[] arr = {1, 2, 3};
        changeVal(num);
        changeArray(arr);
        System.out.println("num after method: " + num);      // 50 (unchanged)
        System.out.println("arr[0] after method: " + arr[0]); // 100 (changed)

        // 3) Largest of 4
        System.out.println("Max: " + maxOfFour(5, 12, 8, 3));

        // 4) Count consonants
        System.out.println("Consonants: " + countConsonants("Hello World"));

        // 5) Is prime
        System.out.println("Is 7 prime? " + isPrime(7));

        // 6) High/Low
        int[] highLowResult = highLow(new int[]{4, 7, 1, 9, 2});
        System.out.println("High: " + highLowResult[0] + ", Low: " + highLowResult[1]);

        // 7) Divisible list
        ArrayList<Integer> divList = divisibleList(30, 3, 5);
        System.out.println("List length: " + divList.size());

        // 8) Reverse in place
        int[] nums = {1, 2, 3, 4, 5};
        reverseArray(nums);
        System.out.print("Reversed: ");
        for(int n : nums) System.out.print(n + " ");
    }
}