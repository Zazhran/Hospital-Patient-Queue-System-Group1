package shared;

public class Patient {
    String id;
    String name;
    int age;
    String ailment;

    public Patient(String id, String name, int age, String ailment) {
        this.id      = id;
        this.name    = name;
        this.age     = age;
        this.ailment = ailment;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

   @Override
    public String toString() {
        return "[" + id + "] " + name + ", umur: " + age + ", keluhan: " + ailment;
    }

