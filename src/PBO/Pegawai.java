package pbo;

public class Pegawai {
    // Atribut (enkapsulasi)
    private String nama;
    private String nip; // Nomor Induk Pegawai
    private String jabatan;

    // Konstruktor
    public Pegawai(String nama, String nip, String jabatan) {
        this.nama = nama;
        this.nip = nip;
        this.jabatan = jabatan;
    }

    // Setter (mutator)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Getter (accessor)
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    // Method untuk menampilkan informasi pegawai
    public String displayInfo() {
        return "Nama: " + getNama() +
               "\nNIP: " + getNip() +
               "\nJabatan: " + getJabatan();
    }

    // Polymorphism (Overloading)
    public String displayInfo(String departemen) {
        return displayInfo() + "\nDepartemen: " + departemen;
    }
}
