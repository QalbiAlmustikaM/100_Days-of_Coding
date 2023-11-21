package Day45;

import java.util.Date;

public class StringFormat {
    public static void main(String[] args) {
        // Buat objek Date untuk mewakili tanggal dan waktu saat ini
        Date tanggal = new Date();
        
        // tanggal dengan format 2023-11-22
        String output = String.format("%tD", tanggal);
        System.out.println(output); 
        
         // tanggal dengan format13:20:00
        output = String.format("%tT", tanggal);
        System.out.println(output);

    }
}

