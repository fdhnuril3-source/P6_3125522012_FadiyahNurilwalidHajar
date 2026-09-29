public class PegawaiToko extends Person {
    private String idPegawai;

    public PegawaiToko(String idPegawai, String nama, String alamat) {
        super(nama, alamat);
        this.idPegawai = idPegawai;
    }

    public String getIdPegawai() {
        return this.idPegawai;
    }

    // Overriding method kedua dari Person (Bagian B)
    @Override
    public void tampilkanPeran() {
        System.out.println("Peran: Pegawai / Staf Toko (ID: " + this.idPegawai + ")");
    }
}