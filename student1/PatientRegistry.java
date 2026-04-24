import java.util.ArrayList;

public class PatientRegistry {
    // Membuat list untuk menampung banyak objek Patient
    private ArrayList<Patient> listPasien;

    // Cunstructor: Menyiapkan list saat objek Registry dibuat
    public PatientRegistry() {
        this.listPasien = new ArrayList<>();
    }

    // 1. Tambah Pasien
    public void add(Patient p) {
        listPasien.add(p);
    }

    // 2. Cek Total Pasien
    public int size() {
        return listPasien.size();
    }

    // 3. Cari Pasien berdasarkan ID
    public Patient findById(String id) {
        for (Patient p : listPasien) {
            // Mengambil id dari Patient.java dan membandingkannya
            if (p.getId().equalsIgnoreCase(id)) {
                return p; // Ketemu!
            }
        }
        return null; // Tidak ketemu
    }

    // 4. Hapus Pasien berdasarkan ID
    public boolean remove (String id) {
        for (int i = 0; i < listPasien.size(); i++) {
            if (listPasien.get(i).getId().equalsIgnoreCase(id)) {
                listPasien.remove(i);
                return true; // Berhasil dihapus
            }
        }
        return false; // Gagal (ID tidak ada)
    }

    // 5. Tampilkan Semua Pasien
    public void listAll() {
        if (listPasien.isEmpty()) {
            System.out.println("Data pasien kosong.");
        } else {
            for (Patient p : listPasien) {
                // Ini akan memanggil metode toString() yang ada di  Patient.java
                System.out.println(p);
            }
        }
    }
}
                
    

    
        


    






    
           

    
    
                        
                    
