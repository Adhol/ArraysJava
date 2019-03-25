package arrays.task14;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            int[] arr = new int[arrayLength];

            int countOne;
            int countZero;
            int whileCount = 0;

            do {
                countOne = 0;
                countZero = 0;
                for (int i = 0; i < arrayLength; i++) {
                    int r = (int) Math.round(Math.random());
                    arr[i] = r;
                    if (arr[i] == 0) {
                        countZero++;
                    } else {
                        countOne++;
                    }
                }
                whileCount++;
            } while (countOne < countZero);


            for(int n : arr) {
                System.out.println(n);
            }

            System.out.println("Zero " + countZero);
            System.out.println("One " + countOne);
            System.out.println("whileCount " + whileCount);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
