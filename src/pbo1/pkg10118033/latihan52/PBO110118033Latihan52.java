
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan informasi
 *                     dosen atau mahasiswa.
 *  
 */

package pbo1.pkg10118033.latihan52;

public class PBO110118033Latihan52 {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        mahasiswa.setNim("10110269");
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        System.out.println("NIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}