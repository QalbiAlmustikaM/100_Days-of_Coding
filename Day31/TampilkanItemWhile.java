package Day31;


public class TampilkanItemWhile {
    public static void main(String[] args) {
        // Buatlah array item
        String[] items = {"Buku", "Pensil", "Mouse", "Penghapus", "Penggaris"};

        // Tampilkan item dengan perulangan while
        int i = 0;
        while (i < items.length) {
            System.out.println(items[i]);
            i++;
        }
    }
}
