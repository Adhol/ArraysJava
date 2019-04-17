package arrays.task14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter array length:");

            int arrayLength = in.nextInt();

            Integer[] arr = new Integer[arrayLength];

            for (int i = 0; i < (arrayLength / 2) + 1; i++) {
                arr[i] = 1;
            }


            Collections.shuffle(Arrays.asList(arr));

            for (int i = 0; i < arrayLength; i++) {
                if(arr[i] == null) {
                    arr[i] = 0;
                }
                System.out.println(arr[i]);
            }



        } catch (java.util.InputMismatchException e) {
            System.out.println("Not correct array length");
        }
    }
}
