package pbo;

// Inheritance dari Pegawai
public class PegawaiDetail extends Pegawai {

    public PegawaiDetail(String nama, String nip, String jabatan) {
        super(nama, nip, jabatan);
    }

    // Method untuk mengambil tahun masuk dari NIP
    public int getTahunMasuk() {
        // Contoh NIP: 198905152020031002
        // Tahun masuk biasanya di posisi ke-9 s/d ke-12
        String tahun = getNip().substring(8, 12);
        return Integer.parseInt(tahun);
    }

    // Method untuk menentukan unit kerja berdasarkan kode departemen
    public String getUnitKerja() {
        // Misal: kode unit kerja dari 3 digit terakhir
        String kodeUnit = getNip().substring(15, 18);
        switch (kodeUnit) {
            case "001": return "Keuangan";
            case "002": return "IT";
            case "003": return "SDM";
            case "004": return "Operasional";
            default: return "Unit Tidak Diketahui";
        }
    }

    // Override displayInfo untuk menambahkan detail tambahan
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nTahun Masuk: " + getTahunMasuk() +
               "\nUnit Kerja: " + getUnitKerja();
    }
}
