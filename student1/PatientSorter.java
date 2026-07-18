package student1;
import shared.Patient;
// Menggunakan Selection Sort
// Menambahkan algoritma Insertion Sort untuk sorting umur

public class PatientSorter {
    private Patient[] patients;

    // Constructor untuk inisialisasi array pasien
    public PatientSorter(Patient[] patients) {
        this.patients = patients;
    }

    // 1. SELECTION SORT: Mengurutkan Nama Pasien secara Afabetis (A-Z)
    public void sortByName() {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                // Membandingkan string menggunakan method compareTo()
                if (patients[j].getName().compareTo(patients[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }

            // Proses pertukaran (Swapping) objek Patient
            if (minIndex != i) {
                Patient temp = patients[i];
                patients[i] = patients[minIndex];
                patients[minIndex] = temp;
            }
        }
    }
    
    // 2. INSERTION SORT: Mengurutkan Umur Pasien dari Muda ke Tua
    public void sortByAge() {
        int n = patients.length;

        for (int i = 1; i < n; i++) {
            Patient key = patients[i]; // Mengambil objek pasien saat ini
            int j = i - 1;

            // Melakukan pergeseran selama umur pasien lebih besar dari key.getAge(
            while (j >= 0 && patients[j].getAge() > key.getAge()) {
                patients[j + 1] = patients[j];
                j = j - 1;
            }
            //Menyisipkan kembali objek pasien key ke posisi yang tepat
            patients[j + 1] = key;
        }
    }

    // 3. DISPLAY METHOD: Mencetak data pasien ke konsol
    public void printList(String header) {
        System.out.println("\n=== " + header + " ===");
        int n = patients.length;
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + patients[i].getName() +
                              " (Umur: " + patients[i].getAge() +
                              ", Keluhan: " + patients[i].getAilment() + ")") ;
        }
    }
}
