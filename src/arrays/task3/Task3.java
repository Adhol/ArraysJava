/**
 * Заполнить массив последовательными нечетными числами, начиная с единицы.
 */

package arrays.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 2 + 1;
            }

            for (int n : arr) {
                System.out.println(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }


    }
}
