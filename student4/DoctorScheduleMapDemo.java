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

        Appointment appt1 = new Appointment(p1.getId(), doc1.getId(), "pemeriksaan rutin");
        Appointment appt2 = new Appointment(p2.getId(), doc1.getId(), "kontrol lanjutan");
        Appointment appt3 = new Appointment(p3.getId(), doc2.getId(), "konsultasi umum");

        // masukkan ke map
        DoctorScheduleMap.addAppointment(doc1.getName(), p1.getId(), appt1.getNotes());
        DoctorScheduleMap.addAppointment(doc1.getName(), p2.getId(), appt2.getNotes());
        DoctorScheduleMap.addAppointment(doc2.getName(), p3.getId(), appt3.getNotes());

        // demo semua method
        DoctorScheduleMap.listDoctors();
        DoctorScheduleMap.getAppointments(doc1.getName());
        DoctorScheduleMap.removeDoctor(doc2.getName());
        DoctorScheduleMap.getAppointments(doc2.getName());
        DoctorScheduleMap.showSize();
    }
}