public class MataKuliahMain13 {
    public static void main(String[] args) {
        MataKuliah13 mk1 = new MataKuliah13();
        mk1.kodeMK = "CR7";
        mk1.nama = "Muhammad Fatahillah Athabrani";
        mk1.sks = 3;
        mk1.jumlahJam = 3;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(3);
        mk1.kurangiJam(4);

        MataKuliah13 mk2 = new MataKuliah13("Cristiano","Muhammad Fatahillah Athabrani", 5, 3);
        mk2.tambahJam(7);
        mk2.tampilkanInformasi();
    }
    
}
