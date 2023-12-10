package Day63;

import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        String kategori = tentukanKategoriUsia(usia);

        System.out.println("Kategori usia Anda: " + kategori);

        scanner.close();
    }

    // Fungsi untuk menentukan kategori usia
    private static String tentukanKategoriUsia(int usia) {
        if (usia < 0) {
            return "Usia tidak valid";
        } else if (usia < 5) {
            return "Balita";
        } else if (usia < 12) {
            return "Anak-anak";
        } else if (usia < 18) {
            return "Remaja";
        } else if (usia < 60) {
            return "Dewasa";
        } else {
            return "Lansia";
        }
    }
}
