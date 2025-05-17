/**
 * Demonstrasi For Loop untuk Perpangkatan
 * @author luqmanaru
 */
public class PerpangkatanFor {
    public static void main(String[] args) {
        int angka = 3;
        int pangkat = 4;
        int hasil = 1;

        for (int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }

        System.out.println("Hasil perpangkatan: " + hasil);
    }
}
