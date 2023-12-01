package Day54;

import java.util.LinkedList;

public class PollDemo {
    public static void main(String[] args) {
        // Buat LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Tambahkan elemen ke LinkedList
        list.add("A");
        list.add("B");
        list.add("C");

        // Hapus elemen pertama
        list.poll();

        // Tampilkan LinkedList
        System.out.println(list);
    }
    
}
