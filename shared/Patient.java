package shared;

public class Patient {
    String id;
    String name;
    int age;
    String ailment;

    Patient(String id, String name, int age, String ailment) {
        this.id      = id;
        this.name    = name;
        this.age     = age;
        this.ailment = ailment;
    }
}
