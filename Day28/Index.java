package Day28;

public class Index {

    public static void main(String[] args) {

        // Membuat array dan Elemen yang ingin dicari
        int[] array = {1, 2, 3, 4, 5};
        int target = 3; 

        // Mencari indeks elemen
        int indeks = -1; // Inisialisasi indeks dengan -1 (tidak ditemukan)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indeks = i; // Menetapkan indeks jika elemen ditemukan
                break; // Keluar dari loop setelah elemen ditemukan
            }
        }

        // Mencetak indeks elemen
        if (indeks != -1) {
            System.out.println("Indeks dari elemen " + target + " adalah " + indeks);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array");
        }
    }
}
