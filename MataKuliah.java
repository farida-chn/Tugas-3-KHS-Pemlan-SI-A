// TUGAS 3 PEMROGRAMAN LANJUT SI A
// Nama : Farida Choirun Nisa 
// NIM  : 235150401111001

public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private double nilaiAngka;

    // Constructor
    public MataKuliah(String kodeMK, String namaMK, double nilaiAngka) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    // Getter dan Setter
    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public double getNilaiAngka() {
        return nilaiAngka;
    }

    public void setNilaiAngka(double nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }

    // Method untuk mengonversi nilai angka menjadi nilai huruf
    public String konversiNilai() {
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return "  A";
        } else if (nilaiAngka >= 60 && nilaiAngka < 80) {
            return "  B";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return "  C";
        } else if (nilaiAngka >= 40 && nilaiAngka < 50) {
            return "  D";
        } else {
            return "  E";
        }
    }
}