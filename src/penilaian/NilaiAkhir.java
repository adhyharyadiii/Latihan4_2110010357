package penilaian;

public class NilaiAkhir extends Mahasiswa{
    int uts, uas, tugas;

    NilaiAkhir(String nama, String npm, int uts, int uas, int tugas) {
        super(nama,npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    @Override
    public void setNpm(String npm) {
        super.setNpm(npm); 
    }

    @Override
    public String getNpm() {
        return super.getNpm(); 
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); 
    }

    @Override
    public String getNama() {
        return super.getNama(); 
    }
    
    public double hitungNilaiAkhir() {
        return 0.3*uas + 0.3*uts + 0.4*tugas;
    }
}