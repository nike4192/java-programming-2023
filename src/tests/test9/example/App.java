package tests.test9.example;

import java.util.List;

public class App {
    public static final String SYSTEM_OUT_DELIMITER = "\n";
    public static void main(String[] args) {
        List<String> names = List.of(new String[]{
            "Keanu;Holder;50",
            "Junior;Sharpe;30",
            "Chloe;Love;2",
            "Dominik;Logan;32",
            "Earl;Ross;61",
            "Aimee;Sosa;37",
            "Ivan;Small;62",
            "Jason;Reilly;68",
            "Shreya;Horn;4",
            "Mackenzie;Finch;27",
        });

        // 1
        System.out.println("1. Map names to persons\n");
        List<Person> persons = names.stream()
            .map(s -> {
                String[] parts = s.split(";");
                return new Person(parts[0], parts[1], Integer.parseInt(parts[2]));
            }).toList();

        System.out.printf("%s persons\n", persons.size());

        System.out.print(SYSTEM_OUT_DELIMITER);

        // 2
        System.out.println("2. Persons with 4 or great letters in first name\n");
        persons.stream()
            .filter(p -> p.firstName().length() > 4)
            .forEach(System.out::println);

        System.out.print(SYSTEM_OUT_DELIMITER);

        // 3
        System.out.println("3. Persons with age less than 28\n");
        persons.stream()
            .filter(p -> p.age() < 28)
            .forEach(System.out::println);
    }
}
