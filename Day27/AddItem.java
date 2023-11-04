package Day27;

import java.util.ArrayList;
import java.util.Scanner;

public class AddItem {
    public static void main(String[] args) {
        // Buat ArrayList untuk menyimpan item
        ArrayList<String> items = new ArrayList<>();

        // Item pertama
        items.add("Buku");

        // Item kedua
        items.add("Pensil");

        // item ketiga
        items.add("Penghapus");

        // Tampilkan item
        System.out.println("Daftar item:");
        for (String item : items) {
            System.out.println(item);
        }

        // Tambahkan item baru
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan item baru: ");
        String newItem = scanner.nextLine();
        items.add(newItem);

        // Tampilkan item yang sudah ditambahkan
        System.out.println("Daftar item setelah menambahkan item baru:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
