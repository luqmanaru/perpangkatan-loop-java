/**
 * Demonstrasi Do-While Loop untuk Perpangkatan
 * @author luqmanaru
 */
public class PerpangkatanDoWhile {
    public static void main(String[] args) {
        int angka = 3;
        int pangkat = 4;
        int hasil = 1;
        int count = 0;

        do {
            hasil *= angka;
            count++;
        } while (count < pangkat);

        System.out.println("Hasil perpangkatan: " + hasil);
    }
}
