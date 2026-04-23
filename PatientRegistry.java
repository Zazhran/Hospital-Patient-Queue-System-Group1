 public class main {

    staticclass patient {
        String id;
        String Name;
        int age;
        String illness;

        public patient(String id, String Name, int age, String illness) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.illness = illness;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void display() {
            system.out.println(id + " - " + name + " (" + age + " tahun) - " + illness);
        }
    }

    
    static class PatientSorter {
        Patient[] patients;
        int size;

        public PatientSorter(Patient[] patients) {
            this.patients = patients;
            this.size = patients.lenght; 
        }
        public void sor tByName() {
            for (int i = 0; i < size - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < size; j++) {
                    if (patients{j}).getName().compareTo(patients[minIndex]).getName()) <0) {
                        minIndex = j;
                    }
                }
                swap(i, minIndex1);
            }
        }


        public void sortByAge() {
            for(int i = 1; i < size; i++) {
                Patient key = patients[i];
                int j = i - 1;

                while (j >= 0 && patients[j].getAge() > key,getAge()) {
                    patients[j + 1] = patients[j];
                    j--;
                }
                patients{j + 1} = key;
            }
        }


        private void swap(int i, int j) {
            Patient temp =  patients[i];
            patient[i] = patients[j];
            patient[j] = temp;
        }


        public void print(String title) {
            system.out.println(" +\n=== " + title + " ==="); 
            for (int i = 0; i < size; i++) {
                patients[i].display();
            }
        }
    }


public static void main(String[] args) {

    patient[] data = {
        new patient("POO1", "Siti Rahma", 28, "Demam"),
        new patient("P002", "Ahmad Fauzi", 52, "Nyeri dada"),
        new patient("P003", "Budi Santoso", 35, "Batuk"),
        new patient("P004", "Dina Putri", "flu")
    };

    PatientSorter sorter = new PatientSorter(data);


    sorter.sortByname();
    sorter.print("Urut Nama (A-Z)");


    sorter.sortByAge();
    sorter.print("Urut Umur (Muda ke Tua)");
}
        
                 



