/**
 * Сформировать массив из элементов арифметической прогрессии с заданным первым элементом x и разностью d.
 */

package arrays.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter array length:");
            int arrayLength = in.nextInt();
            System.out.println("Enter first element");
            int firstElement = in.nextInt();
            System.out.println("Enter difference");
            int difference = in.nextInt();

            int[] arr = new int[arrayLength];

            arr[0] = firstElement;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + difference;
            }
            for (int n : arr) {
                System.out.println(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct input");
        }
    }
}
