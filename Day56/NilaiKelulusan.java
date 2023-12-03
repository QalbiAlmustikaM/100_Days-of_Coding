package Day56;

import java.util.Scanner;

public class NilaiKelulusan {
    public static void main(String[] args) {
        float nilai;

        // Minta pengguna memasukkan nilai
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        nilai = scanner.nextFloat();

        // Periksa nilai kelulusan
        if (nilai >= 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else if (nilai >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
}
