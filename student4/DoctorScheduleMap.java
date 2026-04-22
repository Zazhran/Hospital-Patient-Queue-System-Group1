package student4;

public class DoctorScheduleMap {
    
    static class Appointment {
        String patientName;
        String time;

        Appointment(String patientName, String time) {
            this.patientName = patientName;
            this.time = time;
        }
    }

    static class DoctorNode {
        String doctorName;
        Appointment appointment;
        DoctorNode next;

        DoctorNode(String doctorName, Appointment appointment) {
            this.doctorName = doctorName;
            this.appointment = appointment;
            this.next = null;
        }
    }


    static int size = 0;
    static DoctorNode[] buckets = new DoctorNode[5];

    static int hash(String doctorName) {
        return Math.abs(doctorName.hashCode()) % 5;
    }

    static void addAppointment(String doctor, String patient, String notes) {
        int index = hash(doctor);
        Appointment appt = new Appointment(patient, notes);
        DoctorNode newNode = new DoctorNode(doctor, appt);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
        System.out.println("Janji temu berhasil ditambahkan: Dr." + doctor + " > " + patient + " keterangan: " + notes);
    }

    static void getAppointments(String doctor) {
        int index = hash(doctor);
        DoctorNode current = buckets[index];
        boolean found = false;
        int nomor = 1;

        System.out.println("\n=== Jadwal Dr." + doctor + "===");
        while(current != null) {
            if(current.doctorName.equals(doctor)) {
                System.out.println(nomor + ". pasien " + current.appointment.patientName + " - " + current.appointment.time);
                nomor++;
                found = true;
            }
            current = current.next;
        }
        if(!found) {
            System.out.println("Tidak ditemukan jadwal untuk: Dr." + doctor);
        }
    }

    static void removeDoctor(String doctor) {
        int index = hash(doctor);
        DoctorNode current = buckets[index];
        DoctorNode prev = null;

        while(current != null) {
            if(current.doctorName.equals(doctor)) {
                if(prev == null) buckets[index] = current.next;
                else
                    prev.next = current.next;
                size--;
                current = (prev == null) ? buckets[index] : prev.next;
            } else {
                prev = current;
                current = current.next;
            }
        }
        System.out.println("\nDr." + doctor + " berhasil dihapus dari jadwal.");
    }

    static void listDoctors() {
        System.out.println("n=== Daftar Dokter ===");
        String[] seen = new String[size + 1];
        int seenCount = 0;
        boolean found = false;

        for(int i = 0; i < 5; i++) {
            DoctorNode current = buckets[i];
            while(current != null) {
                boolean existed = false;
                for(int j = 0; j < seenCount; j++) {
                    if(seen[j].equals(current.doctorName)) existed = true;
                }
                if(!existed) {
                    int count = 0;
                    DoctorNode sum = buckets[hash(current.doctorName)];
                    while(sum != null) {
                        if(sum.doctorName.equals(current.doctorName)) count++;
                        sum = sum.next;
                    }
                    System.out.println("- Dr." + current.doctorName + " : " + count + " janji temu");
                    seen[seenCount++] = current.doctorName;
                    found = true;
                }
                current = current.next;
            }
        }

        if(!found) {
            System.out.println("Tidak ada dokter yang terdaftar.");
        }
    }

    static void showSize() {
        System.out.println("\nTotal janji temu: " + size);
    }


}
