// TUGAS 3 PEMROGRAMAN LANJUT SI A
// Nama : Farida Choirun Nisa 
// NIM  : 235150401111001

import java.util.ArrayList;
import java.util.Scanner;

public class KHSApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat ArrayList untuk menyimpan daftar mahasiswa
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        // Loop untuk memasukkan data setiap mahasiswa
        boolean nextMahasiswa = true;
        while (nextMahasiswa) {
            System.out.print("Masukkan NIM : ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama : ");
            String nama = scanner.nextLine();

            // Membuat objek Mahasiswa berdasarkan input pengguna
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama);

            // Membuat ArrayList untuk menyimpan daftar mata kuliah mahasiswa
            ArrayList<MataKuliah> mataKuliahs = new ArrayList<>();

            // Loop untuk memasukkan data setiap mata kuliah mahasiswa
            boolean nextMataKuliah = true;
            while (nextMataKuliah) {
                System.out.print("Masukkan Kode Mata Kuliah : ");
                String kodeMK = scanner.nextLine();
                System.out.print("Masukkan Nama Mata Kuliah : ");
                String namaMK = scanner.nextLine();
                System.out.print("Masukkan Nilai Angka Mata Kuliah : ");
                double nilaiAngka = scanner.nextDouble();
                scanner.nextLine(); // Membersihkan karakter newline setelah nextDouble()

                // Membuat objek MataKuliah berdasarkan input pengguna
                MataKuliah mataKuliah = new MataKuliah(kodeMK, namaMK, nilaiAngka);
                mataKuliahs.add(mataKuliah);

                // Meminta konfirmasi untuk menambahkan mata kuliah lain
                System.out.print("Tambahkan mata kuliah lain? (y/t) : ");
                String tambahMK = scanner.nextLine();
                
                // Menentukan apakah user ingin menambah mata kuliah lagi atau tidak
                if (tambahMK.equals("t")) {
                    nextMataKuliah = false;
                }
            }

            // Menambahkan daftar mata kuliah ke objek Mahasiswa
            mahasiswa.setMataKuliahs(mataKuliahs);
            // Menambahkan objek Mahasiswa ke dalam ArrayList mahasiswas
            mahasiswas.add(mahasiswa);

            // Meminta konfirmasi untuk menambah mahasiswa lain
            System.out.print("Tambah mahasiswa lain? (y/t) : ");
            String tambahMahasiswa = scanner.nextLine();

            // Menentukan apakah user ingin menambah mahasiswa lain atau tidak
            if (tambahMahasiswa.equals("t")) {
                nextMahasiswa = false;
            }
        }

        // Menampilkan KHS setiap mahasiswa
        for (Mahasiswa mhs : mahasiswas) {
            System.out.println("\n===================================================================================");
            System.out.println("\t\t\t\tKARTU HASIL STUDI (KHS)");
            System.out.println("NIM  : " + mhs.getNim());
            System.out.println("Nama : " + mhs.getNama());
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.printf("| %-5s | %-15s | %-45s | %-5s |\n", "NO", "KODE", "NAMA MATA KULIAH", "NILAI");
            System.out.println("-----------------------------------------------------------------------------------");
            int counter = 1;
            // Menampilkan setiap mata kuliah dan nilai mahasiswa
            for (MataKuliah mk : mhs.getMataKuliahs()) {
                System.out.printf("| %-5d | %-15s | %-45s | %-5s |\n", counter++, mk.getKodeMK(), mk.getNamaMK(), mk.konversiNilai());
            }
            System.out.println("-----------------------------------------------------------------------------------");
        }

        // Menutup objek Scanner setelah penggunaan selesai
        scanner.close();
    }
}
