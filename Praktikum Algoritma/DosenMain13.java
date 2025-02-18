public class DosenMain13 {

    public static void main(String[] args) {
        Dosen13 ds1 = new Dosen13();
        ds1.idDosen = "07";
        ds1.nama = "bu vivin";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2010;
        ds1.bidangKeahlian = "Pemrograman";

        ds1.tampilkanInformasi();
        ds1.setStatusAktif(false);
        ds1.hitungMasaKerja(2025);
        ds1.ubahKeahlian("Agama");

        Dosen13 ds2 = new Dosen13("08", "bu wilda", false, 2017, "rpl");
        ds2.ubahKeahlian("Pemrograman");
        ds2.tampilkanInformasi();
    }
}
