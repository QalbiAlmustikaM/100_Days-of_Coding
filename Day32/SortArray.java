package Day32;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 7, 3, 8, 1, 6, 4};

        // Urutkan array dalam urutan ascending
        Arrays.sort(numbers);

        // Tampilkan array yang telah diurutkan
        System.out.println("Array yang telah diurutkan:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
