package Day49;

import java.util.ArrayList;

public class ArrayListTipeDataCampuran {
    public static void main(String[] args) {
        ArrayList<Object> daftar = new ArrayList<>();

        // Tambahkan elemen ke ArrayList
        daftar.add("Apel");
        daftar.add(10);
        daftar.add(true);

        // Tampilkan elemen di ArrayList
        for (Object objek : daftar) {
            System.out.println(objek);
    
        }
    }
}
