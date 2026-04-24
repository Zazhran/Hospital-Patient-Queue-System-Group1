public class PatientDequeDemo {
    public static void main(String[] args) {

        PatientDeque deque = new PatientDeque();

        // Tambah pasien
        deque.addRear(new Patient("P001", "Budi Santoso", 35, "demam"));
        deque.addRear(new Patient("P002", "Siti Nuraini", 28, "sakit kepala"));
        deque.addFront(new Patient("P003", "Ahmad Fauzi", 52, "nyeri dada")); // prioritas

        deque.display();

        System.out.println("Depan: " + deque.peekFront().getName());
        System.out.println("Belakang: " + deque.peekRear().getName());

        deque.removeFront();
        deque.removeRear();

        deque.display();

        deque.removeFront();
        deque.removeFront(); // harus muncul error
    }
}
