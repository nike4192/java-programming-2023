package tests.test3.book;

import java.util.Date;

public class Author {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    private String[] penNames;

    private final Date birthDate;

    public Author(String firstName, String lastName, String middleName, Date birthDate, String[] penNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.penNames = penNames;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String[] getPenNames() {
        return penNames;
    }

    public void setPenNames(String[] penNames) {
        this.penNames = penNames;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
