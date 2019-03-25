package arrays.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    arr[i] = 1;
                } else if (i == arr.length - 1) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
            }
            for (int n : arr) {
                System.out.print(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}

