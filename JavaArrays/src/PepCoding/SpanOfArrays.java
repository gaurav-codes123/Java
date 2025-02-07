package PepCoding;

import java.util.Scanner;

public class SpanOfArrays {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {  // Properly closes the Scanner
            int n = sc.nextInt(); 
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            int span = max - min;
            System.out.println(span);
        }
    }
}
