package Day55;

import java.util.LinkedList;

public class PeekFirstExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Menambahkan elemen ke linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        // Menghapusnya menggunakan peekFirst()
        String firstElement = linkedList.peekFirst();

        // Menampilkan hasil
        System.out.println("Elemen pertama (tanpa menghapus): " + firstElement);

        // Menampilkan linked list setelah menggunakan peekFirst()
        System.out.println("Linked list setelah menggunakan peekFirst(): " + linkedList);
    }
}
