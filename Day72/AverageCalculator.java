package Day72;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];

        System.out.print("Masukkan nilai-nilai dalam array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        double average = calculateAverage(arr);

        System.out.println("Rata-rata nilai dalam array: " + average);
    }

    // Fungsi untuk menghitung rata-rata nilai dalam array
    private static double calculateAverage(double[] arr) {
        double sum = 0;

        for (double value : arr) {
            sum += value;
        }

        return sum / arr.length;
    }
}
