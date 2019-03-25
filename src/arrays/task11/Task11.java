package arrays.task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            for (int i = 0; i <= arrayLength - 3; i+=3) {
                int x = (int) (Math.random() * 10);
                arr[i] = x;
                arr[i + 1] = x;
                arr[i + 2] = x;
            }

            for(int n : arr) {
                System.out.println(n);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
