public class Patient {
  private String id;
  private String name;
  private int age;
  private String ailment;

  public Patient(String id, String name, int age, String ailment) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.ailment = ailment;
 }

public String getId() {
  return id;
 }

public String getName() {
  return name;
 }

public String getAge() {
  return age;
 }

public String getAilment() {
  return ailment;
 }
}
  
  
