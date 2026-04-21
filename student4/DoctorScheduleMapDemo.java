package student4;

import shared.Doctor;
import shared.Patient;
import shared.Appointment;


public class DoctorScheduleMapDemo {
    public static void main(String[] args) {

        // bikin entity objects
        Doctor doc1      = new Doctor("D001", "Andi", "Umum");
        Doctor doc2      = new Doctor("D002", "Budi", "Gigi");
        Patient p1       = new Patient("P001", "Cahyo", 30, "demam");
        Patient p2       = new Patient("P002", "Dewi", 25, "batuk");
        Patient p3       = new Patient("P003", "Eko", 40, "pusing");

        Appointment appt1 = new Appointment(p1.id, doc1.id, "pemeriksaan rutin");
        Appointment appt2 = new Appointment(p2.id, doc1.id, "kontrol lanjutan");
        Appointment appt3 = new Appointment(p3.id, doc2.id, "konsultasi umum");

        // masukkan ke map
        DoctorScheduleMap.addAppointment(doc1.name, p1.id, appt1.notes);
        DoctorScheduleMap.addAppointment(doc1.name, p2.id, appt2.notes);
        DoctorScheduleMap.addAppointment(doc2.name, p3.id, appt3.notes);

        // demo semua method
        DoctorScheduleMap.listDoctors();
        DoctorScheduleMap.getAppointments(doc1.name);
        DoctorScheduleMap.removeDoctor(doc2.name);
        DoctorScheduleMap.getAppointments(doc2.name);
        DoctorScheduleMap.showSize();
    }
}