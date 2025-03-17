package minggu5;

public class MainNilaiMahasiswa{
    public static void main(String[] args) {

        nilaiUTSMahasiswa mhs = new nilaiUTSMahasiswa();

        int[] nilaiUTS = {78,85,90,76,92,88,80,82};
        int[] nilaiUAS = {82,88,87,79,95,85,83,84};

        System.out.println("Nilai UTS Tertinggi: "+ mhs.nilaiUTStertinggi(nilaiUTS, 0, nilaiUTS.length-1));
        System.out.println("Nilai UTS Terendah: "+ mhs.nilaiUTSterendah(nilaiUTS, 0, nilaiUTS.length-1));
        System.out.println("Rata-Rata Nilai UTS: "+ mhs.rataRata(nilaiUTS));
        System.out.println("Rata-Rata Nilai UAS: "+ mhs.rataRataUAS(nilaiUAS));
    }
}