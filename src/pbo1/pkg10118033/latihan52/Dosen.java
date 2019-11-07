package pbo1.pkg10118033.latihan52;

public class Dosen extends Manusia{
    private String nip, matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void mengajarApa(){
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang mengajar matakuliah PBO");
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}