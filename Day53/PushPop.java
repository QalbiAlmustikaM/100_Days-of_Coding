package Day53;

import java.util.Stack;

public class PushPop {
    public static void main(String[] args) {
        // Membuat tumpukan (stack) baru untuk bilangan bulat
        Stack<Integer> stack = new Stack<>();

        // Menambahkan nilai tumpukan
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Menampilkan tumpukan
        System.out.println(stack);
        // Mengambil elemen teratas dari tumpukan
        System.out.println(stack.pop());
        // Menampilkan isi dari tumpukan setelah operasi pop
        System.out.println(stack);
    }
}
