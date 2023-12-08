package tests.test9.example;

public record Person(String firstName, String lastName, int age) {
    public Person {}

    public String toString() {
        return String.format("Person <%s %s, %s yo>", firstName, lastName, age);
    }
}