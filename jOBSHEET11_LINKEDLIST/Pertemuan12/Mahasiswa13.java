package Pertemuan12;

public class Mahasiswa13 {
    String nama,nim,kelas;
    double ipk;

    Mahasiswa13(){
    }

    Mahasiswa13(String nama, String nim, String kelas, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilinformasi() {
         System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}