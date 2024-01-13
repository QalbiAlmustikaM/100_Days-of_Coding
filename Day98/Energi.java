package Day98;

import java.util.Scanner;

public class Energi {
    public static void main(String[] args) {
        // Mendeklarasikan variabel
        Scanner input = new Scanner(System.in);
        String pilihan;
        boolean lanjut = true;

        // Menjalankan program
        do {

            // Menampilkan menu
            System.out.println("----------------------------------------------------------------");
            System.out.println("| Perhitungan Energi |");
            System.out.println("| 1. Energi Kenetik |");
            System.out.println("| 2. Energi Potensial |");
            System.out.println("| 3. Energi Mekanik |");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Masukkan pilihan Anda: ");
            pilihan = input.nextLine();

            // Menghitung energi
            switch (pilihan) {
                case "1":
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("| Energi Kenetik |");
                    System.out.println("Masukkan massa benda (kg): ");
                    double massa = input.nextDouble();
                    System.out.println("Masukkan kecepatan benda (m/s): ");
                    double kecepatan = input.nextDouble();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Energi kinetik: " + hitungEnergiKinetik(massa, kecepatan));
                    break;
                case "2":
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("| Energi Potensial |");
                    System.out.println("Masukkan massa benda (kg): ");
                    massa = input.nextDouble();
                    System.out.println("Masukkan tinggi benda (m): ");
                    double tinggi = input.nextDouble();
                    System.out.println("Masukkan gravitasi (m/s^2): ");
                    double gravitasi = input.nextDouble();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Energi potensial: " + hitungEnergiPotensial(massa, tinggi, gravitasi));
                    break;
                case "3":
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("| Energi Mekanik |");
                    System.out.println("Masukkan energi kinetik (joule): ");
                    double energiKinetik = input.nextDouble();
                    System.out.println("Masukkan energi potensial (joule): ");
                    double energiPotensial = input.nextDouble();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Energi mekanik: " + hitungEnergiMekanik(energiKinetik, energiPotensial));
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            // Menentukan apakah program dilanjutkan
            System.out.println("Lanjutkan program? (Y/N): ");
            lanjut = input.nextLine().equalsIgnoreCase("Y");

        } while (lanjut);

    }

    // Fungsi untuk menghitung energi kinetik
    public static double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * kecepatan * kecepatan;
    }

    // Fungsi untuk menghitung energi potensial
    public static double hitungEnergiPotensial(double massa, double tinggi, double gravitasi) {
        return massa * gravitasi * tinggi;
    }

    // Fungsi untuk menghitung energi mekanik
    public static double hitungEnergiMekanik(double energiKinetik, double energiPotensial) {
        return energiKinetik + energiPotensial;
    }
    
}
