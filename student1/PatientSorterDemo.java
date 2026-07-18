package student1;
import shared.Patient;
// Menambahkan data pasien tiruan untuk pengujian program

public class PatientSorterDemo {
    public static void main(String[] args) {
        //Menyiapkan data pasien acak sesuai skenario uji coba
        Patient[] dataPasien = {
            new Patient("P001", "Siti Rahma", 28, "Demam"),
            new Patient("P002", "Ahmad Fauzi", 52, "Nyeri Dada"),
            new Patient("P003", "Budi Santoso", 35, "Sakit Kepala"),
            new Patient("P004", "Dewi Lestari", 19, "Batuk")
        };
    
        // Instansiasi objek Sorter
        PatientSorter sorter = new PatientSorter(dataPasien);

        // Uji Coba 1: Tampilkan data awal sebelum disorting
        sorter.printList("Data Pasien Awal (Belum Terurut)");

        // Uji coba 2: Jalankan Selection Sort (Urut Nama A-Z)
        sorter.sortByName();
        sorter.printList("Hasil Urut Nama - Selection Sort (A-Z)");

        // Uji coba 3: Jalankan Insertion Sort (Urut Umur Muda-Tua)
        sorter.sortByAge();
        sorter.printList("Hasil Urut Umur - Insertion Sort (Muda ke Tua)");
    }
}
