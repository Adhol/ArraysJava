package arrays.task8;

import java.util.Scanner;

public class Task8 {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            int n = 2;

            for (int i = 0; i < arr.length;) {
                if (isPrime(n)) {
                    arr[i] = n;
                    n++;
                    i++;
                } else {
                    n++;
                }
            }

            for(int m : arr) {
                System.out.println(m);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
