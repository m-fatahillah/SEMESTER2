package Tugas;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahProses = 0;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
    }

    public void proses() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa proses KRS!");
            return;
        }
        System.out.println("Mahasiswa diproses KRS:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            size--;
            jumlahProses++;
        }
    }

    public void lihatAwal() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        if (size < 2) {
            System.out.println("Data antrian kurang dari 2.");
        }
        System.out.println("2 Antrian paling depan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian paling akhir:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong: ");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDiproses() {
        return jumlahProses;
    }

    // Tambahan sesuai menu
    public int getSisaAntrian() {
        return size;
    }

    public int getKuotaDPA() {
        return 30 - jumlahProses;
    }
}
