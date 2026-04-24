public class PatientDequeDemo {
  public static void main(String[] atgs) {

    PatientDeque deque = new PatientDeque();

    // Tambah pasien
    deque.addRear(new Patient("p001", "Budiono Siregar", 35, "demam"));
    deque.addRear(new Patient("p002:, "Siti Azzizah", 28, "sakit kepala"));
    deque.addFront(new Patient("p003", "Ahmad Fauzi", 52, "nyeri dada")); // prioritas

    deque.display();

  System.out.println("Depan: " + deque.peekFront().getName());
  System.out.println("Belakang: + deque.peekRear().getName());

  deque.removeFront();
  deque.removeRear();

  deque.display();

  deque.removeFront();
  deque.removeFront(); // harus muncul eror
  }
}
    
    deque
