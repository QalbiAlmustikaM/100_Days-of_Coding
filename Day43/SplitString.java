package Day43;

public class SplitString {
    public static void main(String[] args) {
        // Deklarasi variabel
        String input = "Adik sedang main mobile legends";

        // Memecah string menggunakan spasi sebagai pembatas
        String[] hasilSplit = input.split(" ");

        // Menampilkan hasil pemecahan string
        for (String kata : hasilSplit) {
            System.out.println(kata);
        }
    }
}
