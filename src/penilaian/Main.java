package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir adhy = new NilaiAkhir("M. Adhy Haryadi", "2110010357", 80, 75, 85);
        
        System.out.println("Nama: "+adhy.nama);
        System.out.println("NPM: "+adhy.npm);
        System.out.println("Nilai Akhir: "+adhy.hitungNilaiAkhir());
    }
}
