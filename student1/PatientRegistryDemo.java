package student1;

import shared.Patient;

public class PatientRegistryDemo {
    public static void main(String[] args) {

        PatientRegistry registry = new PatientRegistry();

        registry.add(new Patient("P001", "Budi Santoso", 35, "demam"));
        registry.add(new Patient("P002", "Siti Nuraini", 28, "sakit kepala"));
        registry.add(new Patient("P003", "Ahmad Fauzi", 52, "nyeri dada"));

        System.out.println("Total: " + registry.size());

        registry.findById("P002");

        registry.remove("P001");

        registry.findById("P001");

        registry.listAll();
    }
}
