import java.util.Scanner;

public class DosenDemo {
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
            System.out.println("6. Pencarian Data Dosen Sequential Search");
            System.out.println("7. Pencarian Data Dosen Binary Search");
            System.out.println("8. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    DOSEN13 d = new DOSEN13();
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
                    System.out.println("-----------------------");
                    System.out.println("Pencarian data Menggunakan Sequential Search");
                    System.out.println("------------------------");
                    System.out.println("masukkan usia dosen yang dicari: ");
                    System.out.print("usia: ");
                    double cari = sc.nextDouble();

                    System.out.println("menggunakan sequential searching");
                    int posisi = list.PencarianDataSequential(cari);
                    
                    list.tampilPosisi(cari, posisi);
                    list.tampilDataSearch(cari, posisi);
                    break;
                case 7:
                    System.out.println("----------------------------------");
                    System.out.println("Pencarian data Menggunakan Binary Search");
                    System.out.println("------------------");
                    System.out.println("masukkan usia dosen yang dicari: ");
                    System.out.print("usia: ");
                    double cari2 = sc.nextDouble();
                    System.out.println("--------------------------------");
                    System.out.println("menggunakan binary search");
                    System.out.println("--------------------------------");
                    double posisi2 = list.findBinarySearch(cari2,0,list.idx-1);
                    int pss2 = (int) posisi2;
                    list.tampilPosisi(cari2, pss2);
                    list.tampilDataSearch(cari2, pss2);
                    break; 

                case 8:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilihan != 8);
        sc.close();
    }
}
