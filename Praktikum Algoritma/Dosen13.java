public class Dosen13 {

    public Dosen13(){

    }

    public Dosen13(String id, String nm, boolean SA,int TB, String BK) {
        idDosen = id;
        nama = nm;
        statusAktif = SA;
        tahunBergabung = TB;
        bidangKeahlian = BK;
    }
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif (boolean statusAktifBaru) {
        statusAktif = statusAktifBaru; 
        }

    int hitungMasaKerja (int thnSkrg) { 
        thnSkrg -= tahunBergabung;
        tahunBergabung = thnSkrg;
        return thnSkrg;
        
    }

    void ubahKeahlian (String bidang) {
        bidangKeahlian = bidang;
    }
    
}
