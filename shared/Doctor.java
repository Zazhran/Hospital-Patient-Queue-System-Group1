package shared;

public class Doctor {
    String id;
    String name;
    String Specialization;

    public Doctor(String id, String name, String specialization) {
        this.id             = id;
        this.name           = name;
        this.Specialization = specialization;
    }

    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
}
