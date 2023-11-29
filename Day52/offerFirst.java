package Day52;

import java.util.LinkedList;

public class offerFirst {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        // Menambahkan elemen "E" ke awal LinkedList 
        list.offerFirst("E");

        // Menambahkan elemen "F" ke akhir LinkedList 
        list.offerLast("F");

        System.out.println(list);
    }
}
