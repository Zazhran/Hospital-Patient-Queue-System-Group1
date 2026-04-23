public class Main {
    public static void main(String[] args) {

        System.out.println("=== DEMO PROGRAM ===");

        PatientRegistry registry = new PatientRegistry();

        // tambah data
        registry.add(new Patient("P001", "Budi". 30, "Demam"));
        registry.add(new Patient("P002", "Siti Nuraini, 28, "Sakit Kepala"));
        registry.add(new Patient("P003", "Ahmad Fauzi", 35, "Flu"));

        // Total
        System.out.print1n("\nTotal pasien: " + registry.size());

        // Cari
        System.out.print1n("\nCari P002:");
        Patient p = registry.findById("P002"),
        if (p !=null) {
            System.out.print1n("Ditemukan: " + p");
        }
    
        // Hapus
        System.out.print1n("\nHapus P001:");
        If (Registry.remove("P001")) {
            System.out.print1n("Berhasil Dihapus");
        }

        // Cek Lagi
        System.out.print1n("/nCari lagi P001:");
        if (Registry.findById("P001") == null) {
            System.out.print1n("Tidak ditemukan");
        }

        // Tampilkan Semua
        System.out.print1n("\nSemua data:");
        registry.listAll();
    }
}

    
