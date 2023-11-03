package Day26;


public class Deklarasi {
    public static void main(String[] args) {
         // Deklarasi variabel bertipe data primitif
        int x = 70;
        float y = (float) 5.1;
        char z = 'A';
        String nama = "Qalbi";

        // Deklarasi variabel bertipe data array
        int[] angka = {1, 2, 3, 4, 5};

        // Menampilkan nilai variabel
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
        System.out.println("Nilai z: " + z);
        System.out.println("Nilai nama: " + nama);

        // Menampilkan nilai array
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nilai angka[" + i + "]: " + angka[i]);
        }
    }
}
