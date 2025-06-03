package Pertemuan12;
import java.util.Scanner;
public class SLLMain13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList13 sll = new SingleLinkedList13();
    System.out.println("Masukkan NIM :");
    String nim = sc.nextLine();
    System.out.println("Masukkan Nama :");
    String nama = sc.nextLine();
    System.out.println("Masukkan Kelas :");
    String kelas = sc.nextLine();
    System.out.println("Masukkan IPK :");
    double ipk = sc.nextDouble();
    Mahasiswa13 mhs = new Mahasiswa13(nama, nim, kelas, ipk);
    sll.addlast(mhs);
    
    }
}
