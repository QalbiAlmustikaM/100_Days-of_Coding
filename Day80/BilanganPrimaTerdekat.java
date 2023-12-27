package Day80;

public class BilanganPrimaTerdekat {

    public static void main(String[] args) {
        int x = 100;

        // Cari bilangan prima terdekat
        int primaTerdekat = 0;
        for (int i = x; i >= 2; i--) { // Perbaikan: kondisi i >= 2
            if (isPrima(i)) {
                primaTerdekat = i;
                break; // Keluar dari loop setelah menemukan prima pertama
            }
        }

        System.out.println("Bilangan prima terdekat dari " + x + " adalah " + primaTerdekat);
    }

    private static boolean isPrima(int n) { // Perbaikan: menggunakan parameter n
        if (n <= 1) { // Perbaikan: menangani kasus n <= 1
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
