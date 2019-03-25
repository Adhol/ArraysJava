package arrays.task13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                int r = (int) (2 + Math.random() * arr.length);
                arr[i] = r;
            }

            int k = (int) (Math.random() * arr.length);
            int j = (int) (Math.random() * arr.length);
            arr[k] = 1;
            arr[j] = 1;

            for(int n : arr) {
                System.out.println(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
