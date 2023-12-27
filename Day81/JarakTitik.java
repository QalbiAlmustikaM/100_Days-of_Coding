package Day81;

public class JarakTitik {
    public static void main(String[] args) {
         // Deklarasi variabel
        int x1 = 2;
        int y1 = 3;
        int x2 = 5;
        int y2 = 7;

        // Hitung jarak
        float jarak = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        // Tampilkan jarak
        System.out.println("Jarak antara dua titik (2, 3) dan (5, 7) adalah " + jarak);
    }
}
