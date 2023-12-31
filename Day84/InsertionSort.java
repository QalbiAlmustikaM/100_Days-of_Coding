package Day84;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] angka = {5, 2, 8, 1, 9};
        System.out.println("Angka sebelum diurutkan: " + Arrays.toString(angka));

        for (int i = 1; i < angka.length; i++) {
            int key = angka[i];
            int j = i - 1;
            while (j >= 0 && angka[j] > key) {
                angka[j + 1] = angka[j];
                j--;
            }
            angka[j + 1] = key;
        }

        System.out.println("Angka setelah diurutkan: " + Arrays.toString(angka));
    }
}
