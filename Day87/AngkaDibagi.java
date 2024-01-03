package Day87;

import java.util.Scanner;

public class AngkaDibagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = scanner.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0) {
                jumlah++;
            }
        }

        System.out.println("Jumlah Angka Yang bisa di bagi 3 dari 1-" + angka + " adalah " + jumlah);
    }
    
}
