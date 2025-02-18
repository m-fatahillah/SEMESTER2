public class MataKuliah13 {

    public MataKuliah13(){

    }

    public MataKuliah13(String KM, String nm, int sks,int JJ) {
        kodeMK = KM;
        nama = nm;
        this.sks = sks;
        jumlahJam = JJ;
    }
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS (int sksBaru) {
        sks = sksBaru; 
        }

    void tambahJam (int jamBaru) { 
        jumlahJam += jamBaru;
    }

    void kurangiJam (int jamKurang) {
        jumlahJam -= jamKurang;
    }
    
}