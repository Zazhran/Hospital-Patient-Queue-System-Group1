
public class DoctorScheduleMapDemo {
    public static void main(String[] args) {
        
        DoctorScheduleMap.addAppointment("Iman", "P001", "Pemeriksaan rutin");
        DoctorScheduleMap.addAppointment("Iman", "P002", "Pemeriksaan rutin");
        DoctorScheduleMap.addAppointment("Thanos", "P003", "Operasi");

        DoctorScheduleMap.listDoctors();
        DoctorScheduleMap.getAppointments("Iman");
        DoctorScheduleMap.removeDoctor("Thanos");
        DoctorScheduleMap.getAppointments("Budi");
        DoctorScheduleMap.showSize();
    }
}
