import java.util.Scanner;
public class MahasiswaDemo13 {
    public static void main(String[] args) {
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        int jumMhs;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        jumMhs = sc.nextInt();
        sc.nextLine();

        for (int i=0; i< jumMhs; i++){
            Mahasiswa m = new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1) + ": ");
            System.out.print("NIM: ");
            m.nim= sc.nextLine();
            System.out.print("Nama: ");
            m.nama = sc.nextLine();
            System.out.print("Kelas: ");
            m.kelas = sc.nextLine();
            System.out.print("IPK: ");
            m.ipk = sc.nextDouble();
            sc.nextLine();
            list.tambah(m);
        }

        list.tampil();
        //melakukan pencarian data sequential

        // System.out.println("-----------------------");
        // System.out.println("Pencarian data");
        // System.out.println("------------------------");
        // System.out.println("masukkan ipk mahasiswa yang dicari: ");
        // System.out.println("IPK: ");
        // double cari = sc.nextDouble();
        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int ) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        //melakukan pencarian data binary
        System.out.println("----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("--------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------");
        double posisi2 = list.findBinarySearch(cari,0,jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        

        System.out.println("Data Mahasiswa sebelum Sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK(DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
    
}

