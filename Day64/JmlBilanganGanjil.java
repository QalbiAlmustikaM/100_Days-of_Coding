import java.util.Scanner;

public class JmlBilanganGanjil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan batas bilangan ganjil: ");
            int jumlahBilangan = scanner.nextInt();

            int hasilJumlah = jumlahBilanganGanjil(jumlahBilangan);
            System.out.println("Hasil jumlah bilangan ganjil: " + hasilJumlah);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan bilangan bulat.");
        } finally {
            scanner.close();
        }
    }

    public static int jumlahBilanganGanjil(int jumlahBilangan) {
        int jumlah = 0;
        int bilanganGanjil = 1;

        for (int i = 0; i < jumlahBilangan; i++) {
            jumlah += bilanganGanjil;
            bilanganGanjil += 2;
        }

        return jumlah;
    }
}
