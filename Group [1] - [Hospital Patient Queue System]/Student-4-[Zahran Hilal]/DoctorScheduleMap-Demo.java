public class DoctorScheduleMapDemo {
    public static void main(String[] args) {
        addAppointment("Andi", "P001", "Pemeriksaan rutin");
        addAppointment("Andi", "P002", "Kontrol lanjutan");
        addAppointment("Budi", "P003", "Konsultasi awal");

        showSize();

        listDoctors();

        getAppointments("Andi");

        removeDoctor("Budi");

        getAppointments("Budi");

        getAppointments("Pigeon");

        showSize();
    }
}
