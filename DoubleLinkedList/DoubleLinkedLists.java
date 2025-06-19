public class DoubleLinkedLists {
    Node13 head;
    Node13 tail;
    int size = 0;

    public DoubleLinkedLists() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa13 data) {
        Node13 newNode = new Node13(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa13 data) {
        Node13 newNode = new Node13(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa13 data) {
    Node13 current = head;

    //cari node dengan nim = keyNim
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node13 newNode = new Node13(data);

    //jika current adalah tail, cukup tambahkan di akhir
    if (current == tail) {
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    } else {
        //sisipkan di tengah
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);

    }
    public void print() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa ditampilkan.");
            return;
        }
        Node13 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa13 removedData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah ");
        removedData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        
    }

    public Node13 search(String nim) {
        Node13 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null; 
    }

    public void add(int index, Mahasiswa13 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node13 current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi panjang list.");
            return;
        }
        if (current == tail) {
            addLast(data);
            return;
        }
        Node13 newNode = new Node13(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    public void removeAfter(String keyNim) {
        Node13 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " yang bisa dihapus.");
            return;
        }

        Node13 nodeToRemove = current.next;

        // Jika nodeToRemove adalah tail
        if (nodeToRemove == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = nodeToRemove.next;
            nodeToRemove.next.prev = current;
        }

        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
    }

    //remove node berdasarkan indeks
    public void remove(int index) {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return;
    }
    if (index < 0) {
        System.out.println("Indeks tidak valid.");
        return;
    }
    if (index == 0) {
        removeFirst();
        return;
    }
    Node13 current = head;
    int i = 0;
    while (current != null && i < index) {
        current = current.next;
        i++;
    }
    if (current == null) {
        System.out.println("Indeks melebihi panjang list.");
        return;
    }
    if (current == tail) {
        removeLast();
        return;
    }
    // Hapus node di tengah
    current.prev.next = current.next;
    current.next.prev = current.prev;
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa ditampilkan.");
            return;
        }
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa ditampilkan.");
            return;
        }
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang bisa ditampilkan.");
            return;
        }
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        Node13 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi panjang list.");
            return;
        }
        current.data.tampil();
    }

    public int getsize() {
        // Update size setiap kali dipanggil
        int count = 0;
        Node13 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}