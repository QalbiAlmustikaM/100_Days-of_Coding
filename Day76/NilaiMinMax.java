package Day76;

public class NilaiMinMax {
    public static void main(String[] args) {
        int[] angka = {5, 2, 8, 1, 9};

        int nilaiMax = angka[0];
        int nilaiMin = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > nilaiMax) {
                nilaiMax = angka[i];
            }
            if (angka[i] < nilaiMin) {
                nilaiMin = angka[i];
            }
        }

        System.out.println("Nilai maksimum: " + nilaiMax);
        System.out.println("Nilai minimum: " + nilaiMin);
    }
    
}
