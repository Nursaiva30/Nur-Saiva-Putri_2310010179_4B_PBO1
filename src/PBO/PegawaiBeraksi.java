package pbo;

public class PegawaiBeraksi {
    public static void main(String[] args) {
        // Membuat objek pegawai
        Pegawai pegawai1 = new Pegawai("Rina Kurnia", "198905152020031002", "Staff IT");

        // Menampilkan informasi dasar
        System.out.println("=== DATA PEGAWAI ===");
        System.out.println(pegawai1.displayInfo());

        System.out.println(); // spasi antar output

        // Menampilkan informasi dengan tambahan departemen
        System.out.println("=== DATA PEGAWAI DENGAN DEPARTEMEN ===");
        System.out.println(pegawai1.displayInfo("Teknologi Informasi"));
    }
}
