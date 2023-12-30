package Day83;

public class TahunKabisat {
    public static void main(String[] args) {
        int tahun = 2020;
        
        if((tahun % 4 == 0 && tahun % 100 != 0) ||tahun % 400 == 0){
            System.out.println(tahun + " adalah tahun kabisat");
        }else{
            System.out.println(tahun + " tahun bukan tahun kabisat ");
        }
    }
    
}
