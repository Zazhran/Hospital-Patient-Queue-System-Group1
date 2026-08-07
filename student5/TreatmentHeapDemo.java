package student5;

import shared.Patient;

public class TreatmentHeapDemo {
    public static void main(String[] args) {
        TreatmentHeap heap = new TreatmentHeap();

        // insert (patient, severityScore) - lower score = more critical
        heap.insert(new Patient("P001", "Budi Santoso", 35, "demam"), 3);
        heap.insert(new Patient("P002", "Siti Nuraini", 28, "sakit kepala"), 5);
        heap.insert(new Patient("P003", "Ahmad Fauzi", 52, "nyeri dada"), 1);
        heap.insert(new Patient("P004", "Dewi Kartika", 41, "sesak napas"), 2);

        heap.display();

        heap.extractMin();
        heap.extractMin();

        System.out.println("=== Antrian Kritis (" + 2 + " pasien tersisa) ===");
        heap.display();
    }
}