public class Mahasiswa13{
    String nim;
    String nama;
    String kelas;
    Double ipk;

    Mahasiswa13(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
         System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}