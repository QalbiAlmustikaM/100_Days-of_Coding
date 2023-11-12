package Day35;


public class Fungsi_Method {
    public static void main(String[] args) {
        // Memanggil method "tampilkanPesan"
        tampilkanPesan();

        // Memanggil method "hitungLuas" dengan parameter 10 dan 20
        int luas = hitungLuas(10, 20);
        System.out.println("Luas persegi panjang = " + luas);
    }

    // Method tanpa parameter
    public static void tampilkanPesan() {
        System.out.println("Halo, dunia!");
    }

    // Method dengan parameter
    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }
}
