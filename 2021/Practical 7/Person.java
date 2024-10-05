//Author: Yanga Rubushe

import java.util.Date;

public class Person {
    private String idNumber;
    private String name;
    private Date dateOfBirth;

    public Person(String idNumber, String name, Date dateOfBirth) {
        this.idNumber = idNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int compareTo(Person p) {
        return this.dateOfBirth.compareTo(p.getDateOfBirth());
    }
}
