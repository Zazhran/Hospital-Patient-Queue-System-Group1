public class PatientRegistry {
    private Patient[] patients;
    private int size;
    private int capacity;

    public PatientRegistry() {

        capacity = 10;
        patients = new Patient[capacity];
        size = 0;
    }

    private void resize() {
        capacity *=2;
        Patient[] newPatient = newPatient[capacity];
        for (int i = 0; i < size; i++) {
            new Patients[i] = patients[i];
        }
        patients = newPatient;
    }

    public void add(Patient patient) {
        if (size == capacity) {
            resize();
        }
        patient[size++] = patient;
    }

    public boolean remove(String id) {
        for (int i = 0, i < size; i++) {
            if (patients[i].getid().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    patients[j] = patients[j + 1];
                }
                patients[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public Patient findById(String id) {
        for (int i = 0; i < size; i ++) {
            if (Patients[i].getId().equals(id)) {
                return patients [i];
            }
        }
        return null;
    }

    public void listAll() {
        if (size == 0) {
            System.out.println("Data kosong.");
            return;
        }

        System.out.println("=== Daftar Pasien (" + size + " data) ===");
        for (int i = 0; i < size; i++)
            System.out.println(patients[i]);
        } 
    }
   
    public int size() {
        return size;
    }
}
  
    

      
    
        


    






    
           

    
    
                        
                    
