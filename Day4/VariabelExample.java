package Day4;

public class VariabelExample {
    public static void main(String[] args) {
        //Deklarasi variabel
        int umur;
        double gaji;
        String nama;

        //Inisialisasi variabel
        umur = 20;
        gaji = 50000.0;
        nama = "QalbI";

        //Output nilai variabel
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Gaji: " + gaji);

        //Update variabel
        umur = 21;
        gaji = gaji + 10000.0;
        nama = "Tika";

        //Output nilai yang diperbarui
        System.out.println("Nama (setelah pembaruan): " + nama);
        System.out.println("Umur (setelah pembaruan): " + umur);
        System.out.println("Gaji (setelah pembaruan): " + gaji);
    }
       
}
