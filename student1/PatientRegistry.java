package student1;

import shared.Patient;

public class PatientRegistry {
    private Patient[] data;
    private int size;

    public PatientRegistry() {
        data = new Patient[2]; // kecil biar keliatan resize
        size = 0;
    }

    // resize array
    private void resize() {
        Patient[] newData = new Patient[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    // tambah pasien
    public void add(Patient p) {
        if (size == data.length) {
            resize();
        }
        data[size] = p;
        size++;
    }

    // hapus berdasarkan id
    public void remove(String id) {
        for (int i = 0; i < size; i++) {
            if (data[i].getId().equals(id)) {

                // geser ke kiri
                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j+1];
                }
                
                size--;
                System.out.println("Pasien " + id + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Tidak ditemukan: ID " + id);
    }

    // cari by ID
    public void findById(String id) {
        for (int i = 0; i < size; i++) {
            if (data[i].getId().equals(id)) {
                System.out.println("Ditemukan: " + data[i]);
                return;
            }
        }
        System.out.println("Tidak ditemukan: ID " + id);
    }

    // cari by nama
    public void findByName(String name) {
        boolean ketemu = false;
        for (int i = 0; i < size; i++) {
            if (data[i].getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Ditemukan: " + data[i]);
                ketemu = true;
            }            
        }
        if (!ketemu) {
            System.out.println("Tidak ditemukan nama: " + name);
        }
    }

    // tampil semua
    public void listAll() {
        System.out.println("=== Daftar Pasien (" + size + " data) ===");
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}