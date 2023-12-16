package Day69;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");

        // Iterasi menggunakan for-each loop
        for (String element : queue) {
            System.out.println(element);
        }

        // Menghapus dan mencetak elemen dari queue
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
