import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<String>();
        daftarSiswa.add("Zaki");
        daftarSiswa.add("Budi");
        daftarSiswa.add("Cica");
        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        
        ArrayList<Customer> customers = new ArrayList<>();
        customers.sort((c1, c2) -> c1.name().compareTo(c2.name()));

        System.out.println(customers);
    }
    
    class Customer {
        String name;
    
        public Customer(String name) {
            this.name = name;
        }
    
        public String name() {
            return name;
        }
    }
    
}
