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
                if (i % 2 == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = i % 5;
                }
            }
            for(int n : arr) {
                System.out.println(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
