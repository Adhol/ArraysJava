package arrays.task12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            for (int i = 0; i <= arrayLength - 2; i+=2) {
                int r = (int) (Math.random() * 10);
                arr[i] = r;
                arr[arr.length - 1 - i] = r;
            }

            for(int n : arr) {
                System.out.println(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
