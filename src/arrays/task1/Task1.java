/**
 * Заполнить массив нулям, кроме первого и последнего элементов, которые должны быть равны единице.
 */

package arrays.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            arr[0] = 1;
            arr[arrayLength - 1] = 1;

            for (int n : arr) {
                System.out.print(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}

