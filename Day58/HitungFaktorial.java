package Day58;

import java.util.Scanner;

public class HitungFaktorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input bilangan untuk menghitung faktorial
        System.out.print("Masukkan bilangan untuk menghitung faktorial: ");
        int bilangan = scanner.nextInt();

        // Hitung faktorial
        long faktorial = hitungFaktorial(bilangan);

        System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);

        // Tutup scanner
        scanner.close();
    }

    // Fungsi untuk menghitung faktorial
    private static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
