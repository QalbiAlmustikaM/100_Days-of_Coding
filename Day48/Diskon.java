package Day48;

import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Membaca harga barang
        System.out.print("Masukkan harga barang: ");
        int harga = Sc.nextInt();

        // Membaca persentase diskon
        System.out.print("Masukkan persentase diskon: ");
        int diskon = Sc.nextInt();

        // Menghitung harga setelah diskon
        int hargaDiskon = harga - (harga * diskon / 100);

        // Menampilkan harga setelah diskon
        System.out.println("Harga setelah diskon: Rp" + hargaDiskon);
    }
    
}
