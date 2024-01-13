package Day97;

import java.util.Scanner;

public class HitungBeratIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi variabel
        String gender;
        float tinggiBadan;
        double beratIdeal;

        // Menampilkan menu
        System.out.println("=".repeat(10) + " Menghitung Berat Badan Ideal ".repeat(10) + "".repeat(10));
        System.out.println("Pilih Gender \n1. Laki-laki\n2. Perempuan");
        gender = input.next();

        // Menangani input gender
        if (gender.equals("1")) {
            // Menghitung berat badan ideal laki-laki
            System.out.println("Masukkan tinggi badan Anda (dalam cm): ");
            tinggiBadan = input.nextFloat();
            beratIdeal = (tinggiBadan - 100) - (tinggiBadan - 100) * 0.1;
            System.out.println("Berat badan ideal Anda adalah: " + beratIdeal + " kg");

        } else if (gender.equals("2")) {
            // Menghitung berat badan ideal perempuan
            System.out.println("Masukkan tinggi badan Anda (dalam cm): ");
            tinggiBadan = input.nextFloat();
            beratIdeal = (tinggiBadan - 100) - (tinggiBadan - 100) * 0.15;
            System.out.println("Berat badan ideal Anda adalah: " + beratIdeal + " kg");

        } else {
            // Menampilkan pesan kesalahan
            System.out.println("Pilihan Anda tidak tersedia");
        }

        // Menampilkan prompt untuk mengulang
        System.out.println("Apakah Anda ingin mengulang? (y/n): ");
        String ulang = input.next();
        if (ulang.equals("y")) {
            // Memulai ulang program
            main(args);
        }
    }
    
}
