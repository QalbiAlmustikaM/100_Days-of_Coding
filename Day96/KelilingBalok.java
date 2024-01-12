package Day96;

import java.util.Scanner;

public class KelilingBalok {
    public static void main(String[] args) {
        // Deklarasi variabel
        int panjang, lebar, tinggi, keliling;

        // Menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = input.nextInt();

        // Menghitung keliling balok
        keliling = 4 * (panjang + lebar + tinggi);

        // Menampilkan hasil
        System.out.println("Keliling balok = " + keliling);
    }
}
