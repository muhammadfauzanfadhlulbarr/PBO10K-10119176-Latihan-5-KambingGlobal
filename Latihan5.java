/**
 * Latihan5
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Kambing Global
 */
public class Latihan5 {

    int jumlahkambing = 88;

    public void getJumlahKambing() {
        
        System.out.println("Jumlah Kambing :" + jumlahkambing);
        
    }
    public void tambahJumlahKambing() {
        jumlahkambing = jumlahkambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah :" + jumlahkambing);
        

    }

    public static void main(String[] args) {
        Latihan5 kambingsusu = new Latihan5();

        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingsusu.getJumlahKambing();

        //menambah satu kambing
        kambingsusu.tambahJumlahKambing();

        //menampilkan jumlah kambing
        kambingsusu.getJumlahKambing();
    }
}
