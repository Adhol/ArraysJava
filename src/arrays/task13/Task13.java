/**
 * Сформировать массив из случайных чисел, в которых ровно две единицы, стоящие на случайных позициях.
 */

package arrays.task13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            if (arrayLength == 1) {
                arr[0] = 1;
            } else if (arrayLength == 2){
                arr[0] = 1;
                arr[1] = 1;
            } else {
                for (int i = 0; i < arrayLength; i++) {
                    int r = 2 + (int) (Math.random() * arr.length);
                    arr[i] = r;
                }

                int k = (int) (Math.random() * arr.length);
                int j = (int) (Math.random() * arr.length);

                while(k == j) {
                    j = (int) (Math.random() * arr.length);
                }

                arr[k] = 1;
                arr[j] = 1;
            }

            for(int n : arr) {
                System.out.println(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
