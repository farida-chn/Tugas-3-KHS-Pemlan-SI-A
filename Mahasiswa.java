// TUGAS 3 PEMROGRAMAN LANJUT SI A
// Nama : Farida Choirun Nisa 
// NIM  : 235150401111001

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<MataKuliah> mataKuliahs;

    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.mataKuliahs = new ArrayList<>();
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<MataKuliah> getMataKuliahs() {
        return mataKuliahs;
    }

    public void setMataKuliahs(ArrayList<MataKuliah> mataKuliahs) {
        this.mataKuliahs = mataKuliahs;
    }

    // Method untuk menambahkan mata kuliah
    public void tambahMataKuliah(MataKuliah mk) {
        mataKuliahs.add(mk);
    }
}
