/**
 * Создать массив, на четных местах в котором стоят единицы, а на нечетных местах - числа,
 * равные остатку от деления своего номера на 5.
 */

package arrays.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i % 2 == 0 ? 1 : i % 5;
            }
            for(int n : arr) {
                System.out.println(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
