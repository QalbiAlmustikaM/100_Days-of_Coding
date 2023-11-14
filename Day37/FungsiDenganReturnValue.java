package Day37;

public class FungsiDenganReturnValue {
    public static void main(String[] args) {
        // Memanggil fungsi 
        double hasil = kali(10.0, 20.0);

        // Menampilkan hasil perkalian ke layar
        System.out.println("Hasil perkalian: " + hasil);
    }

    // Mendefinisikan fungsi "kali" yang 
    static double kali(double a, double b) {
        return a * b; 
    }
}
