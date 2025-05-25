package Tugas;

import java.util.Scanner;

public class TugasMain {
    public static void main(String[] args) {
        
        AntrianKRS antrian = new AntrianKRS(10);
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS Mahasiswa");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Lihat Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Terakhir");
            System.out.println("6. Lihat Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Lihat Sisa Antrian");
            System.out.println("8. Lihat Kuota DPA");
            System.out.println("9. Jumlah Mahasiswa yang Sudah Diproses");
            System.out.println("10. Tampilkan Semua Antrian");
            System.out.println();
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.proses();
                    break;
                case 3:
                    antrian.clear();
                    System.out.println("Antrian telah dikosongkan.");
                    break;
                case 4:
                    antrian.lihatAwal();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah dalam Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Sisa Antrian: " + antrian.getSisaAntrian());
                    break;
                case 8:
                    System.out.println("Kuota DPA: " + antrian.getKuotaDPA());
                    break;
                case 9:
                    System.out.println("Jumlah Mahasiswa yang sudah diproses: " + antrian.getJumlahDiproses());
                    break;
                case 10:
                    antrian.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
