package pbo1.pkg10118033.latihan52;

public class Mahasiswa extends Manusia {
    private String nim, kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang belajar di kelas PBO2");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya mahasiswa");
    }
}