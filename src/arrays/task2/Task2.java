/**
 * Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
 */

package arrays.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            for (int i = 1; i < arr.length; i+=2) {
                arr[i] = 1;
            }
            for (int n : arr) {
                System.out.print(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
