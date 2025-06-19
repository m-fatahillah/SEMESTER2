import java.util.Scanner;
public class DLLMain{

        public static Mahasiswa13 inputMahasiswa13(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        Double ipk = scan.nextDouble();
        scan.nextLine(); // consume newline
        return new Mahasiswa13(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do { 
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di Akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Hapus setelah NIM tertentu");
            System.out.println("8. Tambah setelah NIM tertentu");
            System.out.println("9. Tambah di index tertentu");
            System.out.println("10. Hapus di index tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasasarkan indeks");
            System.out.println("14. Tampilkan panjang list");
            System.out.println("0. Keluar");
            System.out.print("pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa13 mhs = inputMahasiswa13(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa13 mhs = inputMahasiswa13(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.println("Masukkan NIM yang dicari:");
                    String nim = scan.nextLine();
                    Node13 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang ingin dihapus setelahnya: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 8 -> {
                    System.out.print("Masukkan NIM yang ingin ditambah setelahnya: ");
                    String nim = scan.nextLine();
                    Mahasiswa13 mhs = inputMahasiswa13(scan);
                    Node13 current = list.search(nim);
                    if (current == null) {
                        System.out.println("NIM tidak ditemukan.");
                    } else if (current == list.tail) {
                        list.addLast(mhs);
                    } else {
                        int idx = 0;
                        Node13 temp = list.head;
                        while (temp != null && temp != current) {
                            temp = temp.next;
                            idx++;
                        }
                        list.add(idx + 1, mhs);
                    }
                }
                case 9 -> {
                    System.out.print("Masukkan index: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa13 mhs = inputMahasiswa13(scan);
                    list.add(idx, mhs);
                }
                case 10 -> {
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.remove(idx);
                }
                case 11 -> {
                    System.out.println("Data pertama:");
                    list.getFirst();
                }
                case 12 -> {
                    System.out.println("Data terakhir:");
                    list.getLast();
                }
                case 13 -> {
                    System.out.print("Masukkan index yang ingin ditampilkan: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idx);
                }
                case 14 -> {
                    System.out.println("Panjang list: " + list.getsize());
                }

                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
                }
                }while (pilihan != 0);
                        scan.close();
                }
}
