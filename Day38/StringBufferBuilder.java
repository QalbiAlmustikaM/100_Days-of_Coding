package Day38;

public class StringBufferBuilder {
    public static void main(String[] args) {

        // Deklarasi variabel nama dengan nilai "Qalbi"
        String nama = "Qalbi";
        System.out.println("Nama: " + nama);
    
        // Deklarasi variabel namaBaru 
        StringBuilder namaBaru = new StringBuilder("Tika");
        // Membalik urutan karakter NamaBaru
        namaBaru.reverse();
        System.out.println("Nama baru: " + namaBaru);
    }
}
