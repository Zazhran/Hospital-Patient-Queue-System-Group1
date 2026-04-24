import shared.Patient;

public class PatientDequeDemo {
    public static void main(String[] args) {

        // Membuat objek deque
        PatientDeque deque = new PatientDeque();

        // Menambahkan pasien
        deque.addRear(new Patient("P001", "Budi Santoso", 35, "demam"));
        deque.addRear(new Patient("P002", "Siti Nuraini", 28, "sakit kepala"));
        deque.addFront(new Patient("P003", "Ahmad Fauzi", 52, "nyeri dada")); // prioritas

        // Menampilkan isi deque
        deque.display();

        // Melihat depan & belakang
        System.out.println("Depan: " + deque.peekFront().getName());
        System.out.println("Belakang: " + deque.peekRear().getName());

        // Menghapus data
        deque.removeFront();
        deque.removeRear();

        // Tampilkan lagi
        deque.display();

        // Uji kondisi kosong
        deque.removeFront();
        deque.removeFront(); // akan muncul error
    }
}
