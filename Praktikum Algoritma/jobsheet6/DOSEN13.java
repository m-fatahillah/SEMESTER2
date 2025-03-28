public class DOSEN13 {

    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    DOSEN13(String kd, String name, Boolean jk,int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age; 
    }

    DOSEN13(){
    }   

    void tampilInformasi(){
        System.out.println("-----Dosen-----");
        System.out.println("Kode: "+ kode);
        System.out.println("Nama: "+ nama);
        System.out.println("Jenis Kelamin: "+ (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: "+ usia);
    }
}