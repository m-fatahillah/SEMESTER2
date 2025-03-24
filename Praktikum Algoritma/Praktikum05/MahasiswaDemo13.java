import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        // Mahasiswa m1 = new Mahasiswa("123", "Zidan", "2A", 3.2);
        // Mahasiswa m2 = new Mahasiswa("124", "Ayu", "2A", 3.5);
        // Mahasiswa m3 = new Mahasiswa("125", "Sofi", "2A", 3.1);
        // Mahasiswa m4 = new Mahasiswa ("126", "Sita", "2A", 3.9);
        // Mahasiswa m5 = new Mahasiswa ("127", "Rina", "2A", 3.7);
        
        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            Mahasiswa m = new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1) + ": ");
            System.out.print("Nama: ");
            m.nama = sc.nextLine();
            System.out.print("NIM: ");
            m.nim = sc.nextLine();
            System.out.print("Kelas: ");
            m.kelas = sc.nextLine();
            System.out.print("IPK: ");
            m.ipk = sc.nextDouble();
            sc.nextLine();
            list.tambah(m);
        }

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
