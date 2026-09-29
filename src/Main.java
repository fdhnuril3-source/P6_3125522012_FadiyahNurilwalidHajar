public class Main {
    // Implementasi Method Overloading (Bagian C)
    public static void cariData(String nama) {
        System.out.println("[Pencarian] Mencari data berdasarkan Nama: " + nama);
    }

    public static void cariData(int idInt) {
        System.out.println("[Pencarian] Mencari data berdasarkan ID (Angka): " + idInt);
    }

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   PENGUJIAN POLYMORPHISM & DYNAMIC BINDING");
        System.out.println("=========================================");

        // Test Overloading (Bagian C)
        System.out.println("\n--- [BAGIAN C: METHOD OVERLOADING] ---");
        cariData("Fadiyah Nurilwalid");
        cariData(101);

        // Test Upcasting & Polymorphic Reference (Bagian D)
        System.out.println("\n--- [BAGIAN D: UPCASTING & POLYMORPHIC REFERENCE] ---");
        Person p1 = new Pelanggan("P001", "Fadiyah Nurilwalid", "Surabaya"); // Upcasting
        Person p2 = new PegawaiToko("EMP01", "Budi Santoso", "Sidoarjo");    // Upcasting

        p1.tampilkanPeran();
        p2.tampilkanPeran();

        // Test Polymorphic Collection & Dynamic Binding (Bagian E & F)
        System.out.println("\n--- [BAGIAN E & F: POLYMORPHIC COLLECTION & DYNAMIC BINDING] ---");
        Person[] daftarPerson = {
            new Pelanggan("P002", "Andi Pratama", "Malang"),
            new PegawaiToko("EMP02", "Siti Aminah", "Gresik"),
            new Pelanggan("P003", "Rina Wati", "Madura")
        };

        // Iterasi Polymorphic Collection
        for (Person p : daftarPerson) {
            p.tampilkanPeran(); // Dynamic binding terjadi di sini
        }
    }
}