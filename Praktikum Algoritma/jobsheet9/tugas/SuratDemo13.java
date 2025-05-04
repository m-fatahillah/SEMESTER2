package tugas;

import java.util.Scanner;

public class SuratDemo13 {
    public static void main(String[] args) {
        StackSurat13 stack = new StackSurat13(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt(); sc.nextLine();
                    stack.push(new Surat13(id, nama, kelas, jenis, durasi));
                    break;
                case 2:
                    Surat13 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat yang diproses:");
                        diproses.tampilkan();
                    }
                    break;
                case 3:
                    Surat13 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Terakhir:");
                        terakhir.tampilkan();
                    } else {
                        System.out.println("Tidak ada surat.");
                    }
                    break;
                case 4:
                    System.out.print("Nama Mahasiswa: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
            }
        } while (pilih != 5);
    }
}
