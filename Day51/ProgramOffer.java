package Day51;

import java.util.LinkedList;

public class ProgramOffer {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("A");
        list.add("B");
        list.add("C");

        // Menambahkan elemen "D" ke akhir LinkedList m
        list.offer("D");
        
        System.out.println(list);
    }
    
}
