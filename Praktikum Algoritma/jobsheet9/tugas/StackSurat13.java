package tugas;

public class StackSurat13 {
    Surat13[] stack;
    int size, top;

    public StackSurat13(int size) {
        this.size = size;
        this.stack = new Surat13[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat13 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat13 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat13 peek() {
        return !isEmpty() ? stack[top] : null;
    }

    public void cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilkan();
                return;
            }
        }
        System.out.println("Surat tidak ditemukan.");
    }
}
