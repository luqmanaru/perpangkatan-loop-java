/**
 * Demonstrasi While Loop untuk Perpangkatan
 * @author luqmanaru
 */
public class PerpangkatanWhile {
    public static void main(String[] args) {
        int angka = 3;
        int pangkat = 4;
        int hasil = 1;
        int count = 0;

        while (count < pangkat) {
            hasil *= angka;
            count++;
        }

        System.out.println("Hasil perpangkatan: " + hasil);
    }
}
