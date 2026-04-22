package shared;

public class Appointment {
    String patientId;
    String doctorId;
    String notes;

    public Appointment(String patientId, String doctorId, String notes) {
        this.patientId  = patientId;
        this.doctorId   = doctorId;
        this.notes      = notes;
    }
    public String getNotes(){
        return this.notes;
    }
}
