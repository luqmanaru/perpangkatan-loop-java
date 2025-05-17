# perpangkatan-loop-java
Program ini menunjukkan cara menghitung perpangkatan menggunakan tiga jenis perulangan berbeda dalam Java.

---

## 📋 Fitur Utama
- Implementasi perpangkatan dengan while loop
- Implementasi perpangkatan dengan do-while loop
- Implementasi perpangkatan dengan for loop
- Perbandingan struktur tiga jenis perulangan

---

## 💻 Contoh Output & Perbandingan
|Jenis Loop	|Output|	Penjelasan|
|------|-----------|----------|
|While	|Hasil perpangkatan: 81	|Mengecek kondisi sebelum eksekusi|
|Do-While|	Hasil perpangkatan: 81	|Mengeksekusi minimal 1 kali sebelum cek kondisi|
|For	|Hasil perpangkatan: 81	|Menggabungkan inisialisasi, kondisi, dan iterasi dalam satu baris|

---

## 📊 Detail Implementasi
```java
// While Loop
while (count < pangkat) {
    hasil *= angka;
    count++;
}

// Do-While Loop
do {
    hasil *= angka;
    count++;
} while (count < pangkat);

// For Loop
for (int i = 0; i < pangkat; i++) {
    hasil *= angka;
}
```

---

**luqmanaru**
