package uaslp.enginering.labs;

import java.time.LocalDate;

public class Alumno {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private int clave;

    public Alumno(String firstName, String lastName, LocalDate birthday, int clave) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.clave = clave;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
}
