package programmingElements.array.level1;

import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Stop if number is 0 or negative
            if (num <= 0) {
                break;
            }

            arr[index] = num;
            index++;

            // Stop if array becomes full
            if (index == 10) {
                break;
            }
        }

        System.out.println("\nNumbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        System.out.println("\nTotal Sum = " + total);

        sc.close();
    }
}

