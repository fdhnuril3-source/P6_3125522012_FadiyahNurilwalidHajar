public class Pelanggan extends Person {
    private String idPelanggan;

    public Pelanggan(String idPelanggan, String nama, String alamat) {
        super(nama, alamat); // Constructor chaining ke Superclass
        this.idPelanggan = idPelanggan;
    }

    public String getIdPelanggan() {
        return this.idPelanggan;
    }

    // Overriding method dari Person (Bagian B)
    @Override
    public void tampilkanPeran() {
        System.out.println("Peran: Pelanggan Toko (ID: " + this.idPelanggan + ")");
    }
}