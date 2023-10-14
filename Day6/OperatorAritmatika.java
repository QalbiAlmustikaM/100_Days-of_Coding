package Day6;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 2;

        //Penjumlahan
        int hasilTambah = angka1 + angka2;
        System.out.println("Hasil Penjumlahan: " + hasilTambah);

        //Pengurangan
        int hasilKurang = angka1 - angka2;
        System.out.println("Hasil Pengurangan: " + hasilKurang);

        //Perkalian
        int hasilKali = angka1 * angka2;
        System.out.println("Hasil Perkalian: " + hasilKali);

        //Pembagian
        int hasilBagi = angka1 / angka2;
        System.out.println("Hasil Pembagian: " + hasilBagi);

        //Sisa Pembagian (Modulus)
        int sisaBagi = angka1 % angka2;
        System.out.println("Sisa Pembagian: " + sisaBagi);
    }
    
}
