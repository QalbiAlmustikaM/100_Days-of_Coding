package Day89;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi variabel
        int waktu = 60;
        String warna = "";

        // Looping selama waktu tidak nol
        while (waktu != 0) {
            // Tentukan warna lampu lalu lintas
            if (waktu >= 30 && waktu <= 60) {
                warna = "Merah";
            } else if (waktu < 30 && waktu >= 0) {
                warna = "Kuning";
            } else {
                warna = "Hijau";
            }

            // Tampilkan warna dan waktu
            System.out.println(warna + " " + waktu);

            // Tunda selama 1 detik
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            // Kurangi waktu
            waktu--;
        }

        // Tampilkan pesan selesai
        System.out.println("Selesai");
    }
    
}
