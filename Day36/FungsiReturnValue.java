package Day36;

public class FungsiReturnValue {
    public static void main(String[] args) {
        int sisi = 10;

        // Memanggil fungsi luas()
        int luas = luasPersegi(sisi);

        // Menampilkan hasil luas
        System.out.println("Luas persegi dengan sisi 10 adalah " + luas);
    }

    // Fungsi luas() dengan tipe return int
    public static int luasPersegi(int sisi) {
        // Menghitung luas persegi
        int luas = sisi * sisi;

        // Mengembalikan nilai luas
        return luas;
    }
}
   
