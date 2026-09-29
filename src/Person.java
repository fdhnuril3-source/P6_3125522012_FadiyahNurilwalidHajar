public class Person {
    private String nama;
    private String alamat;

    public Person(String nama, String alamat) {
        setNama(nama);
        setAlamat(alamat);
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.isBlank()) {
            this.nama = nama;
        } else {
            System.out.println("[ERROR] Nama tidak boleh kosong!");
        }
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        if (alamat != null && !alamat.isBlank()) {
            this.alamat = alamat;
        } else {
            System.out.println("[ERROR] Alamat tidak boleh kosong!");
        }
    }

    // Method umum yang akan dioverride (Bagian B)
    public void tampilkanPeran() {
        System.out.println("Peran: Pengguna Umum (Person)");
    }
}