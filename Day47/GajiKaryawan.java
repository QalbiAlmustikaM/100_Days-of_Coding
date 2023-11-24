package Day47;

public class GajiKaryawan {
    public static void main(String[] args) {
        // Definisikan variabel
        int gajiPokok = 5000000;
        int diskonUangMakan = 25000;
        int diskonTransport = 50000;

        // Hitung gaji bersih
        int gajiBersih = gajiPokok - diskonUangMakan - diskonTransport;

        // Tampilkan hasil
        System.out.println("Gaji pokok: Rp" + gajiPokok);
        System.out.println("Diskon uang makan: Rp" + diskonUangMakan);
        System.out.println("Diskon transport: Rp" + diskonTransport);
        System.out.println("Gaji bersih: Rp" + gajiBersih);
    }

}
