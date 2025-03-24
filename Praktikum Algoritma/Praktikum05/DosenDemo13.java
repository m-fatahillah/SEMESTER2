import java.util.Scanner;

public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen13 list = new DataDosen13();
        int pilihan;

        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Data Dosen ASC");
            System.out.println("4. Sorting Data Dosen DSC");
            System.out.println("5. Sorting Data Dosen Insertion Sort");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    Dosen13 d = new Dosen13();
                    System.out.print("Kode: ");
                    d.kode = sc.nextLine();
                    System.out.print("Nama: ");
                    d.nama = sc.nextLine();
                    System.out.print("Jenis Kelamin(laki laki = true, perempuan = false): ");
                    d.jenisKelamin = sc.nextBoolean();
                    System.out.print("Usia: ");
                    d.usia = sc.nextInt();
                    sc.nextLine();
                    list.tambah(d);
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    System.out.println("Data yang Sudah Terurut Menggunakan BUBBLE SORT (ASC)");
                    list.sortingASC();
                    break;
                case 4:
                    System.out.println("Data yang Sudah Terurut Menggunakan SELECTION SORT (DSC)");
                    list.SortingDSC();
                    break;
                case 5:
                    System.out.println("Data yang Sudah Terurut Menggunakan INSERTION SORT (ASC)");
                    list.insertionSort();
                    break;
                case 6:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilihan != 6);

    }
}
