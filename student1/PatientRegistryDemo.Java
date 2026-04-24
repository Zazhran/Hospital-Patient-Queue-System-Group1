public class Main {
    public static void main(String[] args) {
        // 1. Siapkan Registrasi (Lemari Arsip)
        PatientRegistry registry = new PatientRegistry();
        
        // 2. Tambah Data Pasien ke dalam Registrasi
        registry.add(new Patient ("P001", "Budi", 30, "Demam"));
        registry.add(new Patient ("P002", "Siti Nuraini", 28, "Sakit kepala"));

        System.out.println("=== DEMO PROGRAM PASIEN ===");
        System.out.println("Total Pasien: " registry.size())

        // 3. Demo Cari Pasien
        Patient p = registry.findById("P002");
        if (p != null) {
            System.out.println("Cari P002 Ketemu! Nama: " + p.getName());
        }

        // 4. Demo Hapus Pasien
        registry.remove("P001");
        System.out.println("\nSetelah P001 dihapus, sisa pasien:");
        registry.listAll():
    }
}