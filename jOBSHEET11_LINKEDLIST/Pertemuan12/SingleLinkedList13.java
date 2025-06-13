package Pertemuan12;



public class SingleLinkedList13 {
    NodeMahasiswa13 head;
    NodeMahasiswa13 tail;

    public int indexOf(String key) {
        NodeMahasiswa13 temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // Jika tidak ditemukan
    }
    
    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa13 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null){
                tmp.data.tampilinformasi();
                tmp = tmp.next;
            }
            System.out.println("Linked List Kosong");
        }
        else {
        System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa13 input) {
        NodeMahasiswa13 ndInput = new NodeMahasiswa13(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }

    }

    public void addlast(Mahasiswa13 input) {
        NodeMahasiswa13 ndInput = new NodeMahasiswa13(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa13 input) {
        NodeMahasiswa13 ndInput = new NodeMahasiswa13(input, null);
        NodeMahasiswa13 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput; 
                }
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }

    public void insertAt(int index, Mahasiswa13 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
           
            NodeMahasiswa13 temp = head;
            for (int i = 0; i< index - 1; i++){
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa13(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next; 
            }
        }
    }

    public void getData(int index){
        NodeMahasiswa13 temp = head;
        for (int i  = 0;i< index; i++){
           temp = temp.next;
        }
        temp.data.tampilinformasi();
    }

    public void removeFirst() {
        if (isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa13 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if(isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa13 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp; 
                    }
                    break;
                } 
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index ==0 ) {
            removeFirst();
        }else {
            NodeMahasiswa13 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp; 
            }
        }
    }
}
    
    
